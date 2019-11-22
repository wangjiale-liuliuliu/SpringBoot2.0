package com.example.springboot_git;

import com.example.springboot_git.dao.UserMapper;
import com.example.springboot_git.service.UserService;
import com.example.springboot_git.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootGitApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void test01(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.selAll();
    }

}
