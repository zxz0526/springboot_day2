package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserTest extends BaseTest {

    @Autowired
    UserService userService;

    @Test
    public void login(){
        User user = new User();
        user.setUsername("123");
        user.setPassword("123");
        User login = userService.login(user);
        System.out.println(login);
    }

    @Test
    public void register(){
        User user = new User();
        user.setUsername("123");
        user.setPassword("123");
        userService.registerUser(user);
    }

}
