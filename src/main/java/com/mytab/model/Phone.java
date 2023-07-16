package com.mytab.model;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;

@Entity
public class Phone {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String ddd;
	private String phone;
	@Enumerated(EnumType.STRING)
	private Type type;
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@ManyToOne
	private Person person;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	enum Type{
		MOBILE, 
		LANDLINE
	}
	
	enum Classification{
		BEST,
		CORRECT,
		REGULAR,
		INCORRECT,
		BLACKLIST		
	}
}
