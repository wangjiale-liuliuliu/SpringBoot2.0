package com.example.springboot_git.controller;

import com.example.springboot_git.domain.User;
import com.example.springboot_git.service.impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description 描述信息
 * @Author 毛成豪
 * @Date 2019/11/22 20:17
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<User> users = userService.selAll();
        model.addAttribute("users",users);
        System.out.println(users);
        return "user/user_list";
    }

    @RequestMapping("/showUserById")
    @ResponseBody
    public String showUserById(@PathVariable int id, HttpServletRequest request){
        return userService.selUserById(id).toString();
    }

    @RequestMapping("/goAdd")
    public String goAdd(){
        return "user/user_add";
    }
    @RequestMapping("/addUser")
    public String addUser( User user, HttpServletResponse response){
        System.out.println(user);
        userService.addUser(user);
        try {
            response.sendRedirect("/showUser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping("/delUser")
    public String delUser(int id){
        userService.delUser(id);
        return "forward:/showUser";
    }

    @RequestMapping("/goUpd/{id}")
    public String goUpd(Model model, @PathVariable String id){
        int intId = Integer.parseInt(id);
        User user = userService.selUserById(intId);
        model.addAttribute("user",user);
        return "user/user_upd";
    }

    @RequestMapping("/updUser")
    public String updUser(User user,HttpServletResponse response){
         userService.updUser(user);
        try {
            response.sendRedirect("/showUser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "forward:/showUser";
    }

}
