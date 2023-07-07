package com.mytab.model;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;
@Entity
public class Payment {
	
	@Id
	private Long id;
	private LocalDate date;
	private PaymentMethod paymentMethod;
	private Double amount;
	
	enum PaymentMethod {
		CREDIDCARD,
		CASH,
		DEBITCARD
	}
}
