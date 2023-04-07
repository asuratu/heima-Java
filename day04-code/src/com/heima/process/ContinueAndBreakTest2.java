package com.heima.process;

import java.util.Scanner;

public class ContinueAndBreakTest2 {
    public static void main(String[] args) {
        // 需求：键盘录入一个大于等于2的整数×，计算并返回×的平方根。
        // 结果只保留整数部分，小数部分将被舍去。

        // 请输入一个大于等于2的整数
        System.out.println("请输入一个大于等于2的整数");
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

        int i = 2;
        while (i <= num) {
            if (i * i == num) {
                System.out.println(i);
                break;
            } else if (i * i > num) {
                System.out.println(i - 1);
                break;
            }
            i++;
        }
    }
}
