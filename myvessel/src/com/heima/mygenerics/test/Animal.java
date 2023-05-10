package com.heima.mygenerics.test;

/**
 * @ClassName Animal
 * @Description com.heima.mygenerics.test.Animal
 * @Author AsuraTu
 * @Date 2023/5/9 16:52
 * @Version 1.0.0
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
