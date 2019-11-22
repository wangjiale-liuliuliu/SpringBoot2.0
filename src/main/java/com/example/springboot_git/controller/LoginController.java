package com.example.springboot_git.controller;

import com.example.springboot_git.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/login")
    public String login2(){
        return "login";
    }
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }
}
