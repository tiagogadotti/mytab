package com.mytab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
