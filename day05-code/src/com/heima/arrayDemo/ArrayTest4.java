package com.heima.arrayDemo;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 需求：已知数组元素为{33,95,22,44,55]
        // 请找出数组中最大值并打印在控制台

        // 1. 定义一个数组
        int[] arr = {33, 95, 22, 44, 55};
        // 2. 定义一个变量, 用来记录最大值
        int max = arr[0];
        // 3. 遍历数组
        for (int n : arr) {
            // 4. 判断元素是否大于max
            if (n > max) {
                // 5. 如果大于max, 就将max赋值为当前元素
                max = n;
            }
        }
        // 6. 输出结果
        System.out.println("max = " + max);
    }
}
