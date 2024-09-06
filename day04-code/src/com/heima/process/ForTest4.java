package com.heima.process;

public class ForTest4 {
    public static void main(String[] args) {
        // 初始值为 1, 每次乘以 2, 多少次后会大于 10000

        // 方法一:
        count1(1);

        // 方法二:
        count2(1);

    }

    public static void count1(int num) {
        int count = 0;
        while (num <= 10000) {
            num *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }

    public static void count2(int num) {
        int count = 0;
        for (int s = num; s <= 10000; s *= 2) {
            count++;
        }
        System.out.println("count = " + count);
    }
}
