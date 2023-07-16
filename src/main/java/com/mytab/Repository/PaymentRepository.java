package com.mytab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
