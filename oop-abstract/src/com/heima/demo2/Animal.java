package com.heima.demo2;

/**
 * @ClassName Animal
 * @Description com.heima.demo2.Animal
 * @Author AsuraTu
 * @Date 2023/4/19 17:06
 * @Version 1.0.0
 */
public abstract class Animal {
    // name age
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public abstract void eat();

    public void drink() {
        System.out.println("喝水");
    }

}
