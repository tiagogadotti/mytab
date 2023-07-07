package com.mytab.model;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;

@Entity
public class Phone {

	@Id
	private Long id;
	
	private String ddd;
	private String phone;
	@Enumerated(EnumType.STRING)
	private Type type;
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@ManyToOne
	private Person person;
	
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
