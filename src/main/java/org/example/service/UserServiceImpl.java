package org.example.service;


import lombok.RequiredArgsConstructor;
import org.example.dao.UserDao;
import org.example.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Override
    @Transactional
    public User insert(User user) {
        return userDao.save(user);
    }

    @Override
    @Transactional
    public User update(int userID, String username, String password, Date birthday, Date dateRegister, Date lastLogin) {
        User user = new User().builder()
                .userID(userID)
                .username(username)
                .password(password)
                .dateRegister(dateRegister)
                .lastLogin(lastLogin)
                .dateBirth(birthday)
                .build();

        return userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        userDao.deleteById(id);
    }
}
