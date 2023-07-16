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
	@Column(nullable = true)
	private int accessAttemptCount;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public LocalDateTime getLastAccessAt() {
		return lastAccessAt;
	}
	public void setLastAccessAt(LocalDateTime lastAccessAt) {
		this.lastAccessAt = lastAccessAt;
	}
	public LocalDateTime getLastPasswordResetAt() {
		return lastPasswordResetAt;
	}
	public void setLastPasswordResetAt(LocalDateTime lastPasswordResetAt) {
		this.lastPasswordResetAt = lastPasswordResetAt;
	}
	public int getAccessAttemptCount() {
		return accessAttemptCount;
	}
	public void setAccessAttemptCount(int accessAttemptCount) {
		this.accessAttemptCount = accessAttemptCount;
	}
	
}
