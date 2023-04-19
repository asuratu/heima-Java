package com.heima.demo4;

/**
 * @ClassName Animal
 * @Description com.heima.demo3.Animal
 * @Author AsuraTu
 * @Date 2023/4/19 09:44
 * @Version 1.0.0
 */
public class Animal {
    String age;
    String color;

    public Animal(String age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String food) {
        System.out.println("动物" + age + "岁, " + color + "色, 吃" + food);
    }
}
