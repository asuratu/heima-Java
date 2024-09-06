package com.heima.test;

public class Student {
    private String id;
    private String name;
    private int age;

    // 无参构造器
    public Student() {
    }

    // 有参构造器
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        // 校验年龄是否合法
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法");
            return;
        }
        this.age = age;
    }
}
