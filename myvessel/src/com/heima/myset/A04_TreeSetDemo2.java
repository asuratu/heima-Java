package com.heima.myset;

import java.util.TreeSet;

/**
 * @ClassName A04_TreeSetDemo1
 * @Description com.heima.myset.A04_TreeSetDemo1
 * @Author AsuraTu
 * @Date 2023/5/11 14:42
 * @Version 1.0.0
 */
public class A04_TreeSetDemo2 {
    public static void main(String[] args) {
        // 需求：创建TreeSet集合，并添加3个学生对象
        // 学生对象属性：
        // 姓名，年龄。
        // 要求按照学生的年龄进行排序
        // 同年龄按照姓名字母排列（暂不考虑中文）
        // 同姓名，同年龄认为是同一个

        // 1. 创建集合对象
        TreeSet<Student> ts = new TreeSet<>();
        // 2. 添加元素
        ts.add(new Student("a", 23));
        ts.add(new Student("b", 24));
        ts.add(new Student("c", 22));
        ts.add(new Student("d", 23));
        ts.add(new Student("d", 23));

        // 3. 遍历集合
        System.out.println(ts);

    }
}
