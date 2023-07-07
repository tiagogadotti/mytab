package com.mytab.model;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;

@Entity
@Table(name="customer")
public class Customer extends Person{
	
	@Id
	private Long id;
	
	private LocalDateTime updatedAt;
	@Column(nullable = true)
	private LocalDateTime createdAt;
	private Long updatedBy;
	private Long createdBy;
	private Long classification;
	
	public Long getClassification() {
		return classification;
	}
	public void setClassification(Long classification) {
		this.classification = classification;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", updatedAt=" + updatedAt + ", createdAt=" + createdAt + ", updatedBy="
				+ updatedBy + ", createdBy=" + createdBy + "]";
	}
	
	
}
