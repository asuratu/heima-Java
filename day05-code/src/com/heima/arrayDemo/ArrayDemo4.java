package com.heima.arrayDemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 数组越界
        // 1. 定义一个数组
        int[] arr = {1, 2, 3};
        // 2. 访问数组中的元素
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 3 (数组越界异常)
    }
}
