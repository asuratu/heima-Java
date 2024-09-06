package com.heima.process;

import java.util.Scanner;

public class ForTest5 {
    public static void main(String[] args) {
        // 判断输入的字符串是否是回文字符串

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        // 接收键盘输入
        String s = sc.nextLine();

        // 判断是否是回文字符串
        boolean result = ForTest5.isPalindrome(s);

        // 输出结果
        if (result) {
            System.out.println(s + " 是回文字符串");
        } else {
            System.out.println(s + " 不是回文字符串");
        }

    }

    public static boolean isPalindrome(String s) {
        // 定义两个指针，一个指向头，一个指向尾
        int head = 0;
        int tail = s.length() - 1;


        // 循环条件，当头指针小于尾指针时，循环继续
        while (head < tail) {
            // 判断头指针指向的字符是否与尾指针指向的字符相同
            if (s.charAt(head) != s.charAt(tail)) {
                // 如果不同，则不是回文字符串，返回false
                return false;
            }
            // 否则，头指针和尾指针同时向中间移动一位
            head++;
            tail--;
        }
        // 循环结束，说明字符串是回文字符串，返回true
        return true;
    }
}
