package com.example.springboot_git.service.impl;

import com.example.springboot_git.dao.UserMapper;
import com.example.springboot_git.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 描述信息
 * @Author 毛成豪
 * @Date 2019/11/22 20:08
 */
@Service
public class UserServiceImpl implements UserMapper{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selAll() {
        return userMapper.selAll();
    }

    @Override
    public User selUserById(int id) {
        return userMapper.selUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int delUser(int id) {
        return userMapper.delUser(id);
    }

    @Override
    public int updUser(User user) {
        return userMapper.updUser(user);
    }
}
