package com.heima.logic;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 数字6是一个真正伟大的数字，键盘录入两个整数。
        // 如果其中一个为6，最终结果输出true。
        // 如果它们的和为 6的倍数。最终结果输出true。
        // 其他情况都是false。
        // 请输入第一个整数：
        System.out.println("请输入第一个整数：");
        Scanner a = new Scanner(System.in);
        if (!a.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            a.next();
        }
        int num1 = a.nextInt();
        // 请输入第二个整数：
        System.out.println("请输入第二个整数：");
        Scanner b = new Scanner(System.in);
        if (!b.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            b.next();
        }
        int num2 = b.nextInt();
        // 判断
        boolean result = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;
        System.out.println(result);
    }
}
