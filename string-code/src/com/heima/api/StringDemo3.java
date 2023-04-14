package com.heima.api;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        // 输入字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // 是 new 出来的

        String s1 = "abc";

        // 比较
        System.out.println(s == s1); // false
    }
}
