package com.heima.demo;

/**
 * @ClassName Rabbit
 * @Description com.heima.demo.Rabbit
 * @Author AsuraTu
 * @Date 2023/4/19 18:23
 * @Version 1.0.0
 */
public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

}
