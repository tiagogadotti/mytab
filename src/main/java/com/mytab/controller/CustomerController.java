package com.mytab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.mytab.DTO.CustomerDTO;
import com.mytab.DTO.CustomerDTOWrapper;
import com.mytab.service.CustomerService;

@RestController
public class CustomerController {

	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping(path = "/api/cuscomerById")
	public ResponseEntity<?> getCustomerById(@RequestParam Long id) {
		if (id == null || id <= 0 || id >= Long.MAX_VALUE) {
			return new ResponseEntity<String>("Customer Not Found", HttpStatusCode.valueOf(500));
		}

		try {
			return new ResponseEntity<CustomerDTO>(CustomerDTOWrapper.getCustomerDTO(customerService.getCustomer(id)),
					HttpStatusCode.valueOf(200));
		} catch (Exception e) {
			return new ResponseEntity<String>("Customer Not Found", HttpStatusCode.valueOf(500));
		}
	}

	@PostMapping(path = "/api/saveCustomer")
	public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
		if (customerDTO == null) {
			return new ResponseEntity<String>("Null object", HttpStatusCode.valueOf(500));
		}

		try {
			customerService.saveCustomer(customerDTO);
			return new ResponseEntity<String>("Customer Saved", HttpStatusCode.valueOf(200));
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem saving object", HttpStatusCode.valueOf(500));
		}
	}
}
