package com.heima.arithmetic;

public class Demo4 {
    public static void main(String[] args) {
        // ++ 和 -- 运算符
        int a = 10, b = 10, c = 10, d = 10;
        // 1. 单独使用
        // 1.1 ++ 在变量的前面, 先自增1, 再使用变量
        System.out.println(++a); // 11
        // 1.2 ++ 在变量的后面, 先使用变量, 再自增1
        System.out.println(b++); // 10
        // 1.3 -- 在变量的前面, 先自减1, 再使用变量
        System.out.println(--c); // 9
        // 1.4 -- 在变量的后面, 先使用变量, 再自减1
        System.out.println(d--); // 10

    }

}
