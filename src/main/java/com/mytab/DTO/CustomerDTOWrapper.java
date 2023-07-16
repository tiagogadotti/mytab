package com.mytab.DTO;
import com.mytab.model.*;

public class CustomerDTOWrapper {

	public static final CustomerDTO getCustomerDTO(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(customer.getId());
		dto.setName(customer.getName());
		dto.setBirthDate(customer.getBirthDate());
		dto.setPhones(customer.getPhones());
		dto.setCpf(customer.getCpf());
		return dto;	
	}
	
	public static final Customer getCustomer(CustomerDTO dto) {
		Customer customer = new Customer();
		customer.setId(dto.getId());
	    customer.setName(dto.getName());
	    customer.setBirthDate(dto.getBirthDate());
	    customer.setPhones(dto.getPhones());
	    customer.setCpf(dto.getCpf());
	    return customer;
	}
	
}
