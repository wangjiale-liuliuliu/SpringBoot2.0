package com.example.springboot_git.service.impl;

import com.example.springboot_git.dao.AdminDao;
import com.example.springboot_git.domain.Admin;
import com.example.springboot_git.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public Admin findByName(String user_name) {
        return adminDao.findByName(user_name);
    }
}
