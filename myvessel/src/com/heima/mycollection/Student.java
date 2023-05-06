package com.heima.mycollection;

/**
 * @ClassName Student
 * @Description com.heima.mycollection.Student
 * @Author AsuraTu
 * @Date 2023/5/6 14:51
 * @Version 1.0.0
 */
public class Student {
    // 姓名
    private String name;
    // 年龄
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
}
