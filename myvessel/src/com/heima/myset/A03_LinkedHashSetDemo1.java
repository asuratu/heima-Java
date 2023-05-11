package com.heima.myset;

import java.util.LinkedHashSet;

/**
 * @ClassName A03_LinkedHashSetDemo1
 * @Description com.heima.myset.A03_LinkedHashSetDemo1
 * @Author AsuraTu
 * @Date 2023/5/11 14:22
 * @Version 1.0.0
 */
public class A03_LinkedHashSetDemo1 {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        // 创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("林志玲", 35);
        Student s3 = new Student("凤姐", 33);
        Student s4 = new Student("芙蓉姐姐", 31);
        Student s5 = new Student("翠花", 16);
        Student s6 = new Student("林青霞", 30);
        Student s7 = new Student("林青霞", 30);
        // 添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs.add(s5));
        System.out.println(lhs.add(s6));
        System.out.println(lhs.add(s7));
      
        // 遍历
        for (Student s : lhs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
