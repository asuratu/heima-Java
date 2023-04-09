package com.heima.process;

import java.util.Scanner;

public class ContinueAndBreakTest3 {
    public static void main(String[] args) {
        // 需求：键盘录入一个正整数×，判断该整数是否为一个质数。
        // 如果是质数，就输出“是质数”，否则输出“不是质数”。
        // 简化思路:
        // 1. 从 2 开始, 一直到 x 的平方根, 如果有一个数能够整除 x, 那么 x 就不是质数

        // 请输入一个正整数
        System.out.println("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        // 如果是整数，就接收, 如果不是整数，就报错
        if (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println("输入的整数小于2, 请重新输入。");
            sc.next();
        }

        System.out.println("num = " + num);

        // 获取 x 的平方根
        int sqrt = (int) Math.sqrt(num);
        System.out.println("sqrt = " + sqrt);

        int i = 2;
        while (i <= sqrt) {
            if (num % i == 0) {
                System.out.println("不是质数");
                break;
            }
            i++;
        }
        if (i > sqrt) {
            System.out.println("是质数");
        }

    }
}
