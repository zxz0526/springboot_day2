package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String login(User user, HttpSession session){
        User login = userService.login(user);
        if (login!=null){
            session.setAttribute("user",login);
            return "redirect:/dept/showDept.jsp";
        }else{
            return "redirect:/user/login.jsp";
        }
    }

    @RequestMapping("register")
    public String register(User user){
        userService.registerUser(user);
        return "redirect:/user/login.jsp";
    }


}
