package com.mytab.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.CPF;
import com.mytab.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	public Customer findByCpf(CPF Cpf);
}
