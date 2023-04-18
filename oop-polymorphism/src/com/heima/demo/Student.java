package com.heima.demo;

/**
 * @ClassName Student
 * @Description com.heima.demo.Student
 * @Author AsuraTu
 * @Date 2023/4/18 17:09
 * @Version 1.0.0
 */
public class Student extends Person {
    @Override
    public void show() {
        System.out.println("我是学生, 我叫" + getName() + ", 我今年" + getAge() + "岁");
    }
}
