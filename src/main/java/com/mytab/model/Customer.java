package com.mytab.model;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;

@Entity
@Table(name="customer")
public class Customer extends Person{
	
	private Long classification;
	
	public Long getClassification() {
		return classification;
	}
	public void setClassification(Long classification) {
		this.classification = classification;
	}
	
	
}
