package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {

    User insert(User user);

    User update(User user);

    List<User> findAll();

    User findById(int id);

    User findByUsername(String username);

    void deleteById(int id);

}
