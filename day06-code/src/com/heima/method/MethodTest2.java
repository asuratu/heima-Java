package com.heima.method;

public class MethodTest2 {
    public static void main(String[] args) {
        // 需求：设计一个方法求数组的最大值，并将最大值返回
        int[] arr = {122, 21, 3, 4, 5};

        int max = getMax(arr);
        System.out.println("max = " + max);
    }

    // 定义一个方法, 用来获取数组中的最大值
    public static int getMax(int[] arr) {
        // 1. 定义一个变量, 用来记录最大值
        int max = arr[0];
        // 2. 遍历数组
        for (int n : arr) {
            // 3. 判断元素是否大于max
            if (n > max) {
                // 4. 如果大于max, 就将max赋值为当前元素
                max = n;
            }
        }
        // 5. 返回结果
        return max;
    }
}
