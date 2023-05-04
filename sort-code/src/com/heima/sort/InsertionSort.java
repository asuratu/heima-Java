package com.heima.sort;

import java.util.Arrays;

/**
 * @ClassName InsertionSort
 * @Description com.heima.sort.InsertionSort
 * @Author AsuraTu
 * @Date 2023/4/27 14:18
 * @Version 1.0.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        // 插入排序
        // 原理: 把数组中的元素, 依次插入到有序序列中
        // 需求: 定义一个数组, 对数组中的元素进行排序

        // 1. 定义一个乱序的数组, 10 个元素
        int[] arr = {5, 2, 3, 1, 4, 6, 8, 7, 9, 10};

        int[] ints = insertionSort(arr);

        System.out.println(Arrays.toString(ints));

    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // 寻找元素 arr[i] 合适的插入位置
            int e = arr[i];
            int j; // j保存元素e应该插入的位置
            for (j = i; j > 0 && arr[j - 1] > e; j--) {
                // 如果前一个元素大于当前元素, 就把前一个元素赋值给当前元素
                arr[j] = arr[j - 1];
            }
            // 把当前元素赋值给 j
            arr[j] = e;
        }
        return arr;
    }


}
