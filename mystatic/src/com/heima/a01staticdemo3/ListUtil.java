package com.heima.a01staticdemo3;

import java.util.ArrayList;

/**
 * @ClassName ListUtil
 * @Description com.heima.a01staticdemo3.ListUtil
 * @Author AsuraTu
 * @Date 2023/4/17 17:06
 * @Version 1.0.0
 */
public class ListUtil {
    private ListUtil() {
    }

    // static的注意事项
    // 1. 静态方法只能访问静态变量和静态方法
    // 2. 非静态方法可以访问静态变量或者静态方法，也可以访问非静态的成员变量和非静态的成员方法
    // 3. 静态方法中是没有this关键字

    // 获取年龄最大的学生对象
    public static Student getMaxAgeStudent(ArrayList<Student> list) {
        // 定义一个变量，用于记录年龄最大的学生对象
        Student maxAgeStudent = null;
        // 遍历集合，获取每一个学生对象
        for (Student s : list) {
            // 判断maxAgeStudent是否为null
            if (maxAgeStudent == null) {
                maxAgeStudent = s;
            } else {
                // 获取maxAgeStudent的年龄
                int maxAge = Integer.parseInt(maxAgeStudent.getAge());
                // 获取当前学生对象的年龄
                int age = Integer.parseInt(s.getAge());
                // 判断年龄
                if (age > maxAge) {
                    maxAgeStudent = s;
                }
            }
        }
        return maxAgeStudent;
    }

}
