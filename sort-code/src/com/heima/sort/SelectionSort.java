package com.heima.sort;

import java.util.Arrays;

/**
 * @ClassName SelectionSort
 * @Description com.heima.sort.SelectionSort
 * @Author AsuraTu
 * @Date 2023/4/27 13:58
 * @Version 1.0.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        // 选择排序:
        // 原理: 每一次从待排序的数据元素中选出最小(或最大)的一个元素, 存放在序列的起始位置, 直到全部待排序的数据元素排完
        // 需求: 定义一个数组, 对数组中的元素进行排序

        // 1. 定义一个乱序的数组, 10 个元素
        int[] arr = {5, 2, 3, 1, 4, 6, 8, 7, 9, 10};

        int[] ints = selectionSort(arr);

        System.out.println(Arrays.toString(ints));

    }


    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
