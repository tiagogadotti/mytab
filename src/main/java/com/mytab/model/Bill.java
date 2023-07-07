package com.mytab.model;

import jakarta.persistence.*;

import java.time.*;
import java.util.*;
@Entity
public class Bill {
	@Id
	private Long id;
	@OneToMany
	private List<Entry> entries;
	@OneToMany
	private List<Payment> payments;
	private Double balance;
	
	@OneToMany
	private Set<Payment> scheduledPayments;
	
	private LocalDateTime updatedAt;
	private LocalDateTime createdAt;
	private Long updatedBy;
	private Long createdBy;
}
