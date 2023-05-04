package com.heima.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description com.heima.sort.QuickSort
 * @Author AsuraTu
 * @Date 2023/4/27 14:59
 * @Version 1.0.0
 */
public class QuickSort {
    public static void main(String[] args) {
        // 快速排序
        // 原理: 选取一个基准元素, 把比基准元素小的元素放在左边, 把比基准元素大的元素放在右边
        // 需求: 定义一个数组, 对数组中的元素进行排序

        // 1. 定义一个乱序的数组, 10 个元素
        int[] arr = {5, 2, 3, 1, 4, 6, 8, 7, 9, 10};

        int[] ints = quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(ints));

    }

    private static int[] quickSort(int[] arr, int i, int i1) {
        // 2. 定义两个变量, 一个变量保存数组的第一个元素的索引, 一个变量保存数组的最后一个元素的索引
        int low = i;
        int high = i1;

        // 3. 定义一个变量, 保存基准元素
        int base = arr[low];

        // 4. 定义一个临时变量, 用于交换元素
        int temp;

        // 5. 循环遍历数组, 直到 low 和 high 相等
        while (low < high) {
            // 6. 从后往前遍历数组, 找到比基准元素小的元素
            while (base <= arr[high] && low < high) {
                high--;
            }

            // 7. 从前往后遍历数组, 找到比基准元素大的元素
            while (base >= arr[low] && low < high) {
                low++;
            }

            // 8. 交换元素
            temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
        }

        // 9. 交换基准元素
        arr[i] = arr[low];
        arr[low] = base;

        // 10. 递归调用
        if (low > i + 1) {
            quickSort(arr, i, low - 1);
        }
        if (high < i1 - 1) {
            quickSort(arr, high + 1, i1);
        }

        return arr;
    }


}
