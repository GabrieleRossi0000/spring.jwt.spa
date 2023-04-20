package com.jwt.spring.jwt.spa.repository;

import com.jwt.spring.jwt.spa.models.Role;
import com.jwt.spring.jwt.spa.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(UserRole name);


}
