package com.heima.process;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        // 需求：给你一个整数x。
        // 如果x是一个回文整数，打印 true，否则，返回 false。
        // 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        // 例如，121是回文，而123 不是。

        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(reverse);
        if (reverse == num) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
