package com.heima.demo5;

/**
 * @ClassName Cat
 * @Description 猫类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.printf("%d岁的%s的猫眯着眼睛侧着头吃%s\n", this.getAge(), this.getColor(), food);
    }

    public void catchMouse() {
        System.out.printf("%d岁的%s的猫抓住老鼠\n", this.getAge(), this.getColor());
    }
}
