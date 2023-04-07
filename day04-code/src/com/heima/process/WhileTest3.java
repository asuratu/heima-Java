package com.heima.process;

public class WhileTest3 {
    public static void main(String[] args) {
        // 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
        // 将两数相除，要求不使用乘法、除法和％ 运算符。
        // 得到商和余数。

        // 1. 定义被除数和除数
        int dividend = 101, divisor = 3;
        // 2. 定义商和余数
        int quotient = 0, remainder;
        // 3. 循环相减
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        remainder = dividend;
        System.out.println("商：" + quotient);
        System.out.println("余数：" + remainder);
    }
}
