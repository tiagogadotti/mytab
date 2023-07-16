package com.mytab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mytab.model.*;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
	public Phone findPhoneByDddAndPhoneAndPerson(String ddd, String phone, Person person);
}
