package com.fiap.gabrieltesta.service;

import com.fiap.gabrieltesta.repository.ContactRepository;
import com.fiap.gabrieltesta.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository repository;

    @Override
    public void save(Contact contact) {
        repository.save(contact);
    }
}
