package com.heima.demo;

/**
 * @ClassName Frog
 * @Description com.heima.demo.Frog
 * @Author AsuraTu
 * @Date 2023/4/19 18:18
 * @Version 1.0.0
 */
public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
