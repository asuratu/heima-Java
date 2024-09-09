package com.heima.api;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author asura
 */
public class StringDemo3 {
    public static void main(String[] args) {
        // 输入字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        // 是 new 出来的
        String s = sc.nextLine();

        String s1 = "abc";

        // 比较
        // false
        System.out.println(Objects.equals(s, s1));

        // 字符串反转
        String s2 = new StringBuilder(s).reverse().toString();
        System.out.println(s2);

        // 字符串转大写
        String s3 = s.toUpperCase();
        System.out.println(s3);

        // 过滤空格
        String s4 = s.replaceAll("\\s+", "");
        System.out.println(s4);
    }
}
