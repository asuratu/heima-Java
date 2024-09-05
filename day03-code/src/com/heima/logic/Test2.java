package com.heima.logic;

import java.util.Arrays;

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

        Test2.bubbleSort(new int[]{3, 2, 1, 5, 4});
        Test2.findMaxNumber(new int[]{3, 2, 11, 5, 4});
    }

    // 冒泡排序

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
