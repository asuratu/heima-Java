package com.heima.demo9;

/**
 * @ClassName Lecturer
 * @Description 讲师
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("讲师在工作...");
    }
}
