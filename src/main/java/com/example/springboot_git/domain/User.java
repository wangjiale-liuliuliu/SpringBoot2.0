package com.example.springboot_git.domain;

/**
 * @Description 描述信息
 * @Author 毛成豪
 * @Date 2019/11/22 19:54
 */
public class User {
    private int id;
    private String user_name;
    private int age;
    private String sex;
    private String profession;
    private int tel;

    public User() {
    }

    public User(int id, String user_name, int age, String sex, String profession, int tel) {
        this.id = id;
        this.user_name = user_name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                ", tel=" + tel +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}

