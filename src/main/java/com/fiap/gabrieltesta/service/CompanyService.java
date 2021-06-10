package com.fiap.gabrieltesta.service;

import com.fiap.gabrieltesta.model.Company;

import java.util.List;

public interface CompanyService {

    void save(Company company);

    void delete(Long id);

    void update(Company company);

    Company findById(Long id);

    List<Company> list();

}
