package com.heima.demo5;

/**
 * @ClassName Animal
 * @Description 动物类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String food) {
        System.out.println("动物正在吃：" + food);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
