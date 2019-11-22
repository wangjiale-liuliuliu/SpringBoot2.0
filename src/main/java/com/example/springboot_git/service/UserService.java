package com.example.springboot_git.service;

import com.example.springboot_git.dao.UserMapper;
import com.example.springboot_git.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 描述信息
 * @Author 毛成豪
 * @Date 2019/11/22 20:07
 */
public interface UserService {
    List<User> selAll();
    User selUserById(int id);
    int delUser(int id);
    int updUser(User user);
}
