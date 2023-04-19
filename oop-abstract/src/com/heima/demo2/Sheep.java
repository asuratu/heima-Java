package com.heima.demo2;

/**
 * @ClassName Sheep
 * @Description com.heima.demo2.Sheep
 * @Author AsuraTu
 * @Date 2023/4/19 17:11
 * @Version 1.0.0
 */
public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊吃草");
    }
}
