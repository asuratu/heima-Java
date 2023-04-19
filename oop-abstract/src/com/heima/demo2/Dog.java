package com.heima.demo2;

/**
 * @ClassName Dog
 * @Description com.heima.demo2.Dog
 * @Author AsuraTu
 * @Date 2023/4/19 17:10
 * @Version 1.0.0
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
