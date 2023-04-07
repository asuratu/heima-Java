package com.heima.logic;

public class Demo2 {
    public static void main(String[] args) {
        // 逻辑运算符
        // && 短路与 (两个都为 true, 才为 true) 与 & 的区别是: && 有短路效果
        // 1. 第一个条件为 false, 那么第二个条件不会执行
        // 2. 第一个条件为 true, 那么第二个条件才会执行
        // System.out.println(true && true); // true
        // System.out.println(true && false); // false
        // System.out.println(false && true); // false
        // System.out.println(false && false); // false

        System.out.println("----------------------------");

        // || 短路或 (有一个为 true, 就为 true) 与 | 的区别是: || 有短路效果
        // 1. 第一个条件为 true, 那么第二个条件不会执行
        // 2. 第一个条件为 false, 那么第二个条件才会执行
        // System.out.println(true || true); // true
        // System.out.println(true || false); // true
        // System.out.println(false || true); // true
        // System.out.println(false || false); // false

        System.out.println("----------------------------");

        int a = 10;
        int b = 10;
//        boolean result = ++a < 5 && ++b < 5;
        boolean result = ++a < 5 & ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
