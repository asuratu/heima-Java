package com.heima.demo8;

/**
 * @ClassName Rabbit
 * @Description 兔子类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃草");
    }
}
