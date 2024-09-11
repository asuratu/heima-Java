package com.heima.demo9;

/**
 * @ClassName Teacher
 * @Description 老师
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("老师正在上课...");
    }
}
