package com.heima.demo9;

/**
 * @ClassName Tutor
 * @Description 助教
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Tutor extends Employee {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("助教在工作...");
    }
}
