package com.heima.process;

import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        // 键盘录入两个数字, 并判断这两个数字之间, 既能被3整除, 又能被5整除的数字有哪些
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        // 如果是整数，就接收, 如果不是整数，就报错
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        // 接收键盘输入
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num2 = sc.nextInt();

        // 比较两个数字大小
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // 遍历num1到num2之间的所有数字
        for (int i = num1; i <= num2; i++) {
            // 如果数字能被3整除, 又能被5整除, 就放入数组中
            if (i % 3 == 0 && i % 5 == 0) {
                // 输出符合条件的数字
                System.out.println(i);
            }
        }
    }
}
