package com.heima.method;

public class MethodTest1 {
    public static void main(String[] args) {
        // 需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44,55]

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55};
        // 2. 调用方法
        printArray(arr);
    }

    // 2. 定义一个方法, 用来遍历数组
    public static void printArray(int[] arr) {
        StringBuilder str = new StringBuilder("[");
        // 3. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 4. 判断是否是最后一个元素
            if (i == arr.length - 1) {
                str.append(arr[i]).append("]");
            } else {
                str.append(arr[i]).append(", ");
            }
        }
        System.out.println(str);
    }
}
