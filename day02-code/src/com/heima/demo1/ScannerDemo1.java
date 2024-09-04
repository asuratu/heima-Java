package com.heima.demo1;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        // 如果是整数，就接收, 如果不是整数，就报错
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        // 接收键盘输入
        int num = sc.nextInt();
        System.out.println("num = " + num);
    }
}
