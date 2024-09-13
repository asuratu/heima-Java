package com.heima.demo8;

/**
 * @ClassName Frog
 * @Description 青蛙类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Frog extends Animal implements Swimming {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙正在吃...");
    }

    @Override
    public void swim() {
        System.out.println("青蛙正在游泳...");
    }
}
