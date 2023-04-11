package com.heima.array;

import java.util.Arrays;

public class DoubleDimensionalArray {
    public static void main(String[] args) {
        // 1. 定义一个二维数组
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 2. 遍历二维数组
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // 二维数组格式
        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[4];
        System.out.println(Arrays.deepToString(arr1));


    }
}
