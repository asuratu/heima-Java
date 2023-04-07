package com.heima.logic;

public class Test2 {
    public static void main(String[] args) {
        // 判断三个数字中的最大值
        int a = 10;
        int b = 20;
        int c = 30;

        // 1. 定义一个变量, 用来存储最大值
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }

}
