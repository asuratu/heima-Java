package com.heima.process;

public class WhileTest {
    public static void main(String[] args) {
        // 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我
        // 有一张足够大的纸，它的厚度是0.1毫米。
        // 请问，我折叠多少次，可以折成珠穆朗玛峰的高度？

        // 定义一个变量，用来存储纸的厚度
        double paper = 0.1;
        // 定义一个变量，用来存储折叠的次数
        int count = 0;
        // 定义一个变量，用来存储珠穆朗玛峰的高度
        double height = 8844430;
        while (paper <= height) {
            paper *= 2;
            count++;
        }
        System.out.println("折叠次数：" + count);
    }
}
