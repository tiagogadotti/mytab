package com.mytab.model;

import jakarta.persistence.*;

@Entity
public class Role {
	
	@Id
	private Long id;
	private String description;
}
