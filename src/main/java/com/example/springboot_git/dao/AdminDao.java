package com.example.springboot_git.dao;

import com.example.springboot_git.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminDao {
    @Select("select * from admin where username=#{user_name}")
    Admin findByName(String user_name);
}
