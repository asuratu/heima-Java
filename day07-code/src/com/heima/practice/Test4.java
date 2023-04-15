package com.heima.practice;

public class Test4 {
    public static void main(String[] args) {
        // 需求：把一个数组中的元素复制到另一个新数组中去。

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55};
        // 2. 定义一个新数组
        int[] newArr = new int[arr.length];

        // 3. 将元素赋值给新数组
        System.arraycopy(arr, 0, newArr, 0, arr.length);

        // 4. 打印新数组
        for (int j : newArr) {
            System.out.println(j);
        }

    }
}
