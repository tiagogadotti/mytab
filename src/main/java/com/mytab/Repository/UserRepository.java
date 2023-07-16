package com.mytab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
