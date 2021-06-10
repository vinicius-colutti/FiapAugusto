package com.fiap.gabrieltesta.repository;

import com.fiap.gabrieltesta.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
