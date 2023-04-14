package com.heima.api;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Scanner类的使用
        // 1. 导包
        // 2. 创建对象
        // 3. 调用方法

        // 请输入一个小数
        System.out.println("请输入一个小数");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println("你输入的小数是: " + d);
    }
}
