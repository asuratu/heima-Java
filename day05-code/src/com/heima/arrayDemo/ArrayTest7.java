package com.heima.arrayDemo;

public class ArrayTest7 {
    public static void main(String[] args) {
        // 需求：反转数组中的元素

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        // 2. 遍历数组
        for (int i = 0; i < arr.length / 2; i++) {
            // 3. 交换数组中两个元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // 4. 打印反转后的数组
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
