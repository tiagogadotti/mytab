package com.mytab.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User  extends Person{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(nullable = false)
	private String email;
	@OneToMany
	private List<Role> role;
	private LocalDateTime lastAccessAt;
	private LocalDateTime lastPasswordResetAt;
	@Column(nullable = false)
	private boolean isActive;
	@Column(nullable = true)
	private int accessAttemptCount;
	@Column(nullable = true)
	private LocalDateTime updatedAt;
	@Column(nullable = true)
	private LocalDateTime createdAt;
	private Long updatedBy;
	private Long createdBy;
	
}
