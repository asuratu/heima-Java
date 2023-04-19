package com.heima.demo;

/**
 * @ClassName Dog
 * @Description com.heima.demo.Dog
 * @Author AsuraTu
 * @Date 2023/4/19 18:22
 * @Version 1.0.0
 */
public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }

}
