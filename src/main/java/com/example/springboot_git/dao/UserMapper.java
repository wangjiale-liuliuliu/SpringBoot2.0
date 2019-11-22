package com.example.springboot_git.dao;

import com.example.springboot_git.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description 描述信息
 * @Author 毛成豪
 * @Date 2019/11/22 19:57
 */
@Mapper
public interface UserMapper {
    @Select("select id,user_name,sex,age,profession,tel from user")
    List<User> selAll();

    @Select("select id,user_name,sex,age,profession,tel from user where id=#{id}")
    User selUserById(int id);

    @Update("insert into user values(null,#{user_name},#{sex},#{age},#{profession},#{tel})")
    int addUser(User user);

    @Update("delete from user where id=#{id}")
    int delUser(int id);

    @Update("update user set user_name=#{user_name},sex=#{sex},age=#{age},profession=#{profession},tel=#{tel} where id=#{id}")
    int updUser(User user);
}
