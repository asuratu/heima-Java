package com.heima.demo3;

/**
 * @ClassName Person
 * @Description com.heima.demo3.Person
 * @Author AsuraTu
 * @Date 2023/4/20 16:08
 * @Version 1.0.0
 */
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
}
