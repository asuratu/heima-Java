package com.heima.arrayDemo;

public class ArrayTest6 {
    public static void main(String[] args) {
        // 需求：随机打乱数组中的元素

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        // 2. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 3. 生成一个随机索引
            int index = (int) (Math.random() * arr.length);
            // 4. 交换元素
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        // 5. 输出结果
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
