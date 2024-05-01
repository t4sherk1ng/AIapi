package org.example.service;

import org.example.domain.User;

import java.util.Date;
import java.util.List;

public interface UserService {

    User insert(User user);

    User update(int userID, String username, String password, Date birthday, Date dateRegister, Date lastLogin);

    List<User> findAll();

    User findById(int id);

    User findByUsername(String username);

    void deleteById(int id);

}
