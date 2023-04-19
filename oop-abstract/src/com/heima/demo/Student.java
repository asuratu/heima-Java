package com.heima.demo;

/**
 * @ClassName Student
 * @Description com.heima.demo.Student
 * @Author AsuraTu
 * @Date 2023/4/19 16:39
 * @Version 1.0.0
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("学生要学习");
    }
}
