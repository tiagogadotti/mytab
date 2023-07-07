package com.mytab.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;
@Entity
public class Entry {

	@Id
	private Long id;
	private LocalDate date;
	@OneToMany
	private List<Product> products;
	private Double total;
	private String observations;
	
	
}
