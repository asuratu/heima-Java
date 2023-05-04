package com.heima.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description com.heima.sort.BubbleSort
 * @Author AsuraTu
 * @Date 2023/4/27 13:53
 * @Version 1.0.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 冒泡排序
        // 需求: 定义一个数组, 对数组中的元素进行排序
        // 1. 定义一个乱序的数组, 10 个元素
        int[] arr = {5, 2, 3, 1, 4, 6, 8, 7, 9, 10};

        int[] ints = bubbleSort(arr);

        System.out.println(Arrays.toString(ints));
    }

    private static int[] bubbleSort(int[] arr) {
        // 2. 遍历数组, 获取到数组中的每一个元素
        for (int i = 0; i < arr.length - 1; i++) {
            // 3. 拿当前元素和后面的元素进行比较
            for (int j = i + 1; j < arr.length; j++) {
                // 4. 如果当前元素大于后面的元素, 就交换位置
                if (arr[i] > arr[j]) {
                    // 5. 定义一个临时变量, 用于存储当前元素
                    int temp = arr[i];
                    // 6. 把后面的元素赋值给当前元素
                    arr[i] = arr[j];
                    // 7. 把临时变量中的元素赋值给后面的元素
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
