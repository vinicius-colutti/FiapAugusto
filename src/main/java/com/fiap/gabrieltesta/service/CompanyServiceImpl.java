package com.fiap.gabrieltesta.service;

import com.fiap.gabrieltesta.model.Company;
import com.fiap.gabrieltesta.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public void save(Company company) {
        repository.save(company);
    }

    @Override
    public void delete(Long id) {
        Company company = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID INVÁLIDO" + id));
        repository.delete(company);
    }

    @Override
    public void update(Company company) {
        repository.save(company);
    }

    @Override
    public Company findById(Long id) {
        Company company = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID INVÁLIDO" + id));
        return company;
    }

    @Override
    public List<Company> list() {
        return repository.findAll();
    }
}
