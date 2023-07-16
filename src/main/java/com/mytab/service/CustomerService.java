package com.mytab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytab.Repository.*;
import com.mytab.model.*;
import com.mytab.DTO.*;
import java.util.*;

@Service
public class CustomerService {

	private final CustomerRepository repository;
	private final PhoneRepository phoneRepository;

	@Autowired
	public CustomerService(CustomerRepository repository, PhoneRepository phoneRepository) {
		this.repository = repository;
		this.phoneRepository = phoneRepository;
	}

	public Customer getCustomer(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
	}

	public boolean saveCustomer(CustomerDTO customerDTO) {
		try {
			Customer customer = CustomerDTOWrapper.getCustomer(customerDTO);
			customer.setActive(true);
			Customer existingCustomer = (Customer)repository.findByCpf(customerDTO.getCpf());
			if (existingCustomer == null) {
				repository.save(customer);
			} else {
				customer = existingCustomer;
			}
			
			for (Phone phone : customerDTO.getPhones()) {
				phone.setPerson(customer);
				Phone existingPhone = phoneRepository.findPhoneByDddAndPhoneAndPerson(phone.getDdd(), phone.getPhone(), repository.findByCpf(customerDTO.getCpf()));
				if (existingPhone == null) {
					phoneRepository.save(phone);
				}
			}
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			return false;
		}
		return true;
	}
}
