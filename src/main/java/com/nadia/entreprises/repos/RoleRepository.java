package com.nadia.entreprises.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadia.entreprises.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
