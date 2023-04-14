package com.heima.api;

public class StringDemo2 {
    public static void main(String[] args) {
        // 1. 直接赋值
        String s1 = "abc";
        String s3 = "Abc";
        // 2. char数组
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);

        // 比较两个字符串是否相等
        System.out.println(s1 == s2); // false

        // 使用 == 比较
        // 基础数据类型, 比较的是值
        // 引用数据类型, 比较的是地址值

        // 使用 equals 比较
        System.out.println(s1.equals(s2)); // true

        // 不区分大小写比较
        System.out.println(s3.equalsIgnoreCase(s2)); // true


    }
}
