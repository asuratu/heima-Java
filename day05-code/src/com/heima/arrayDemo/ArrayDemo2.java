package com.heima.arrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 动态初始化的数组, 元素的默认值
        // 整数类型: 0
        // 浮点类型: 0.0
        // 字符类型: '\u0000' (空字符)
        // 布尔类型: false
        // 引用类型: null (除了基本数据类型 [byte, short, int, long, float, double, char, boolean] 之外的类型, 都是引用类型)
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
