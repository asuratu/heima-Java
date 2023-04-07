package com.heima.process;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        // 输入第一个数
        System.out.println("请输入第一个整数：");
        Scanner a = new Scanner(System.in);
        if (!a.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            a.next();
        }
        int num1 = a.nextInt();
        // 输入第二个数
        System.out.println("请输入第二个整数：");
        Scanner b = new Scanner(System.in);
        if (!b.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            b.next();
        }
        int num2 = b.nextInt();

        // 判断
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}
