package com.mytab.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.mytab.model.CPF;
import com.mytab.model.Phone;


public class CustomerDTO {

	private Long id;	
	private List<Phone> phones;
	private String name;
	private CPF cpf;
	private LocalDate birthDate;
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Phone> getPhones() {
		return phones;
	}



	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public CPF getCpf() {
		return cpf;
	}



	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}



	public LocalDate getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", phones=" + phones + ", name=" + name + ", cpf=" + cpf + ", birthDate="
				+ birthDate + "]";
	}
}
