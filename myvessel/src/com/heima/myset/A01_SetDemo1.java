package com.heima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName A01_SetDemo1
 * @Description com.heima.myset.A01_SetDemo1
 * @Author AsuraTu
 * @Date 2023/5/11 10:34
 * @Version 1.0.0
 */
public class A01_SetDemo1 {
    public static void main(String[] args) {
        // 利用 Set 系列的集合, 添加字符串, 并使用多种方法遍历
        // 1. 迭代器
        // 2. 增强 for
        // 3. Lambda 表达式

        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java"); // 如果添加的元素重复, 返回 false, 不会添加到集合中

        System.out.println(set);

        // 1. 迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------");

        // 2. 增强 for
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------");

        // 3. Lambda 表达式
        set.forEach(s -> System.out.println(s));

        System.out.println("--------");

    }
}
