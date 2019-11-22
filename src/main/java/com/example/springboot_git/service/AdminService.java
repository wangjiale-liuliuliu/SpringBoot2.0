package com.example.springboot_git.service;

import com.example.springboot_git.domain.Admin;
import org.springframework.stereotype.Service;

public interface AdminService {
    Admin findByName(String user_name);
}
