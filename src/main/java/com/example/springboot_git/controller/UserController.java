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

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
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
        return "user/user_list";
    }

    @RequestMapping("/showUserById")
    @ResponseBody
    public String showUserById(@PathVariable int id, HttpServletRequest request){
        return userService.selUserById(id).toString();
    }

    @RequestMapping("goAdd")
    public String goAdd(){
        return "user/user_add";
    }
    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "forward:showUser";
    }

    @RequestMapping("/delUser")
    public String delUser(@PathVariable int id){
        userService.delUser(id);
        return "forward:showUser";
    }

    @RequestMapping("/goUpd")
    public String goUpd(Model model, int id){
        User user = userService.selUserById(id);
        model.addAttribute("user",user);
        return "user/user_upd";
    }

    @RequestMapping("/updUser")
    public String updUser(User user){
         userService.updUser(user);
        return "forward:showUser";
    }

}
