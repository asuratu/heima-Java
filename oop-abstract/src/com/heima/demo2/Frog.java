package com.heima.demo2;

/**
 * @ClassName Frog
 * @Description com.heima.demo2.Frog
 * @Author AsuraTu
 * @Date 2023/4/19 17:10
 * @Version 1.0.0
 */
public class Frog extends Animal {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}
