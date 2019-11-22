package com.example.springboot_git.service;

import com.example.springboot_git.domain.Admin;

public interface AdminService {
    Admin findByName(String user_name);
}
