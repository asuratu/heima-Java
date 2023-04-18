package com.heima.demo;

/**
 * @ClassName Teacher
 * @Description com.heima.demo.Teacher
 * @Author AsuraTu
 * @Date 2023/4/18 17:11
 * @Version 1.0.0
 */
public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("我是老师, 我叫" + getName() + ", 我今年" + getAge() + "岁");
    }
}
