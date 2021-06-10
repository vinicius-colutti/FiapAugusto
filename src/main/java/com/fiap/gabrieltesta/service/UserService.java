package com.fiap.gabrieltesta.service;

import com.fiap.gabrieltesta.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
