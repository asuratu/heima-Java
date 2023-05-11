package com.heima.myset;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName A02_HashSetDemo1
 * @Description com.heima.myset.A02_HashSetDemo1
 * @Author AsuraTu
 * @Date 2023/5/11 11:04
 * @Version 1.0.0
 */
public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        // 哈希值：
        // 对象的整数表现形式
        // 1. 如果没有重写hashcode方法，计算出的哈希值是不同的
        // 2. 如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        // 3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）

        // 1. 创建集合对象
        Set<Student> set = new HashSet<>();
        set.add(new Student("张三", 23));
        set.add(new Student("张三", 23));
        set.add(new Student("李四", 24));

        // 2. 遍历集合
        for (Student stu : set) {
            System.out.println(stu);
        }

        System.out.println(set);
        
        // 3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

    }
}
