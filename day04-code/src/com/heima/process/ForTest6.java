package com.heima.process;

public class ForTest6 {
    public static void main(String[] args) {
        // 给定两个整数, 被除数和除数, 计算商和余数, 要求不能使用乘除法, 只能使用加减法

        // 被除数
        int a = 12345;
        // 除数
        int b = 31;

        // 商
        int quotient = 0;
        // 余数
        int remainder;

        while (a >= b) {
            a -= b;
            quotient++;
        }
        remainder = a;

        System.out.println("商: " + quotient);
        System.out.println("余数: " + remainder);
    }
}
