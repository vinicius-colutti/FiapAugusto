package com.fiap.gabrieltesta.repository;

import com.fiap.gabrieltesta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
