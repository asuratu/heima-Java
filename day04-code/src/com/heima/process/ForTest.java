package com.heima.process;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        // 需求: 输入两个数字, 统计这两个数字之间既能被 3 整除, 又能被 5 整除的数字有哪些
        // 请输入第一个数字
        System.out.println("请输入第一个数字");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num1 = sc.nextInt();
        // 请输入第二个数字
        System.out.println("请输入第二个数字");
        Scanner sc2 = new Scanner(System.in);
        if (!sc2.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc2.next();
        }
        int num2 = sc2.nextInt();

        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共有 " + count + " 个");
    }
}
