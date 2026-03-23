package com.nadia.entreprises.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nadia.entreprises.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}