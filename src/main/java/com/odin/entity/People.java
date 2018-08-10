package com.odin.entity;

import java.io.Serializable;

/**
 * @Auther: Odin
 * @Date: 2018/7/26 16:19
 * @Description:
 */
public class People implements Serializable {

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
