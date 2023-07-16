package com.mytab.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.CPF;
import com.mytab.model.Customer;
import com.mytab.model.Person;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	public Person findByCpf(CPF Cpf);
}
