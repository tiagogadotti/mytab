package com.mytab.DTO;

import java.util.List;
import java.util.Set;
import com.mytab.model.Entry;
import com.mytab.model.Payment;


public class BillDTO {
	private Long id;
	private List<Entry> entries;
	private List<Payment> payments;
	private Double balance;
	private Set<Payment> scheduledPayments;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Entry> getEntries() {
		return entries;
	}
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Set<Payment> getScheduledPayments() {
		return scheduledPayments;
	}
	public void setScheduledPayments(Set<Payment> scheduledPayments) {
		this.scheduledPayments = scheduledPayments;
	}
	
	public BillDTO(Long id, List<Entry> entries, List<Payment> payments, Double balance,
			Set<Payment> scheduledPayments) {
		super();
		this.id = id;
		this.entries = entries;
		this.payments = payments;
		this.balance = balance;
		this.scheduledPayments = scheduledPayments;
	}
	
	
}
