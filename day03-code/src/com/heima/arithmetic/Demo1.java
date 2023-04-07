package com.heima.arithmetic;

import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        // + 加法
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        // 分隔符
        System.out.println("----------");

        // - 减法
        int d = 10;
        int e = 20;
        int f = e - d;
        System.out.println(f);
        // 分隔符
        System.out.println("----------");

        // * 乘法
        int g = 10;
        int h = 20;
        int i = g * h;
        System.out.println(i);
        // 分隔符
        System.out.println("----------");

        // / 除法
        int j = 10;
        int k = 20;
        int l = k / j;
        System.out.println(l);
        // 分隔符
        System.out.println("----------");

        // % 取模
        int m = 10;
        int n = 87;
        int o = n % m;
        System.out.println(o);
        // 分隔符
        System.out.println("----------");

        // 如果运算的时候, 有小数参与, 可能会出现不精确的情况
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01); // 0.09999999999999998
        System.out.println(1.1 * 1.01); // 1.1110000000000001
        System.out.println(1.1 / 0.01);
        // 解决方案: 使用int类型, 或者使用BigDecimal类
        // 分隔符
        System.out.println("----------");
        // BigDecimal类
        // 1. 创建对象
        BigDecimal num1 = new BigDecimal("1.1");
        BigDecimal num2 = new BigDecimal("1.01");
        System.out.println(num1.add(num2)); // 2.11

    }
}
