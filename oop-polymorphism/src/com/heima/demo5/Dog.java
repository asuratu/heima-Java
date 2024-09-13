package com.heima.demo5;

/**
 * @ClassName Dog
 * @Description 狗类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.printf("%d岁的%s的狗两只前腿死死的抱住%s猛吃\n", this.getAge(), this.getColor(), food);
    }

    public void lookHome() {
        System.out.printf("%d岁的%s的狗正在看家\n", this.getAge(), this.getColor());
    }
}
