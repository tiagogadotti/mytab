package com.mytab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.mytab.DTO.CustomerDTO;
import com.mytab.DTO.CustomerDTOWrapper;
import com.mytab.model.Customer;
import com.mytab.service.CustomerService;

@RestController
public class CustomerController {
	
	private final CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping(path="/api/cuscomerById")
	public ResponseEntity<?> getCustomerById(@RequestParam Long id) {
		System.out.println("Chamou");
		if (id == null || id <= 0 || id >= Long.MAX_VALUE) {
			return new ResponseEntity<String>("Muito Mal",HttpStatusCode.valueOf(500));
		}
		
		try {
			return new ResponseEntity<CustomerDTO>(	CustomerDTOWrapper.getCustomerDTO(customerService.getCustomer(id)),
													HttpStatusCode.valueOf(200));
		}catch (Exception e) {
			return new ResponseEntity<String>("Customer Not Found",HttpStatusCode.valueOf(500));
		}
	}
	
}
