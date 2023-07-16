package com.mytab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
