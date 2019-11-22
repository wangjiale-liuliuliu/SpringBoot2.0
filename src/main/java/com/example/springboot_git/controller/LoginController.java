package com.example.springboot_git.controller;

import com.example.springboot_git.domain.Admin;
import com.example.springboot_git.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    public String toLogin(HttpServletRequest request,String user_name, String password){
        Admin byName = adminService.findByName(user_name);
        if(byName==null){
            return "login";
        }else if(byName.getPassword().equals(password)){
            request.getSession().setAttribute("admin",user_name);
            return "index";
        }
        return "login";
    }
}
