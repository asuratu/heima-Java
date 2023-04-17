package com.heima.a01staticdemo3;

import java.util.ArrayList;

/**
 * @ClassName StudentTest
 * @Description com.heima.a01staticdemo3.StudentTest
 * @Author AsuraTu
 * @Date 2023/4/17 17:06
 * @Version 1.0.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 需求：定义一个集合，用于存储3个学生对象。
        ArrayList<Student> list = new ArrayList<Student>();

        // 创建学生对象
        Student s1 = new Student("张三", "23", "男");
        Student s2 = new Student("李四", "34", "女");
        Student s3 = new Student("王五", "25", "男");

        // 把学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 获取年龄最大的学生对象
        Student maxAgeStudent = ListUtil.getMaxAgeStudent(list);
        System.out.println("年龄最大的学生对象：" + maxAgeStudent.getName() + ", " + maxAgeStudent.getAge() + ", " + maxAgeStudent.getGender());
    }
}
