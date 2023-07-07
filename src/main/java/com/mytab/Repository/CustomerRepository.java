package com.mytab.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
