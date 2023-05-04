package com.heima.demo;

/**
 * @ClassName GirlFriend
 * @Description com.heima.demo.GirlFriend
 * @Author AsuraTu
 * @Date 2023/5/4 15:49
 * @Version 1.0.0
 */
public class GirlFriend {
    // 属性有姓名、年龄、身高。
    private String name;
    private int age;
    private int height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
