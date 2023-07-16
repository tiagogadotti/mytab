package com.mytab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.*;

public interface PersonRepository extends JpaRepository<Person, Long> {
	public Person findByCpf(CPF Cpf);
	

}
