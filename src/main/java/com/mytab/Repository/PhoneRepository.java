package com.mytab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
