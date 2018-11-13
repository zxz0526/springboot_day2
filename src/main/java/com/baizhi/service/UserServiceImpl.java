package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;
    public User login(User user) {
        return userDAO.queryOne(user);
    }

    @Override
    public void registerUser(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.insert(user);
    }
}
