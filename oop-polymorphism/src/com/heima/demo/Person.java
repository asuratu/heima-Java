package com.heima.demo;

/**
 * @ClassName Person
 * @Description com.heima.demo.Person
 * @Author AsuraTu
 * @Date 2023/4/18 17:08
 * @Version 1.0.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // show 方法
    public void show() {
        System.out.println("我是人类, 我叫" + name + ", 我今年" + age + "岁");
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
