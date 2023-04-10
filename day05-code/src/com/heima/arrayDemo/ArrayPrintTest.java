package com.heima.arrayDemo;

public class ArrayPrintTest {
    public static void main(String[] args) {
        // 需求: 定义一个数组, 用静态初始化完成数组元素的初始化, 然后遍历数组
        int[] arr = {11, 22, 33, 44, 55};

        // 数组长度
        System.out.printf("数组长度: %d\n", arr.length);

        // 遍历数组
        for (int j : arr) {
            System.out.println(j);
        }

        // 编辑器快捷: arry.fori
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
