package com.heima.test;

import java.util.ArrayList;

/**
 * 需求：定义一个集合，添加一些学生对象，并进行遍历
 * 学生类的属性为：姓名，年龄。
 *
 * @author asura
 */
public class Test3 {
    public static void main(String[] args) {
        // 需求：定义一个集合，添加一些学生对象，并进行遍历
        // 学生类的属性为：姓名，年龄。

        // 1. 定义一个集合
        ArrayList<Student> list = new ArrayList<>();

        // 2. 添加学生对象
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));

        // 3. 遍历集合
        for (Student s : list) {
            System.out.println("姓名：" + s.getName() + ", 年龄：" + s.getAge());
        }
    }

}
