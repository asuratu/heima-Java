package com.heima.demo;

/**
 * @ClassName Student
 * @Description Student
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String str) {
        String[] so = str.split(",");
        this.name = so[0];
        this.age = Integer.parseInt(so[1]);
    }

    public Student(String name, int age) {
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
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("年龄不合法");
        }
        this.age = age;
        System.out.println("年龄设置成功");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String toStr() {
        return this.name + "-" + this.age;
    }
}