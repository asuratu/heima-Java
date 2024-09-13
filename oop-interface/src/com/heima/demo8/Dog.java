package com.heima.demo8;

/**
 * @ClassName Dog
 * @Description 狗类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Dog extends Animal implements Swimming {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗狗游泳");
    }


}
