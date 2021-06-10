package com.fiap.gabrieltesta.repository;

import com.fiap.gabrieltesta.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
