package com.heima.test;

/**
 * @ClassName Actor
 * @Description Actor
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Actor {
    String name;
    int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{name='" + name + "', age=" + age + '}';
    }
}
