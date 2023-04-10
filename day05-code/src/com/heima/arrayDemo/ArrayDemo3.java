package com.heima.arrayDemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 数组动态初始化
        // 数据类型[] 数组名 = new 数据类型[数组长度];

        String[] arr = new String[11];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "hello" + i;
        }

        for (String s : arr) {
            System.out.println(s);
        }

        // 将数组 arr 反转
        // 1. 定义一个临时变量
        String temp;
        // 2. 定义两个索引, 一个指向数组的第一个元素, 一个指向数组的最后一个元素
        int start = 0, end = arr.length - 1;
        // 3. 循环交换元素
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("------------");

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
