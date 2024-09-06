package com.heima.method;

public class MethodTest2 {
    public static void main(String[] args) {
        // 需求：设计一个方法求数组的最大值，并将最大值返回
        int[] arr = {122, 21, 3, 4, 5};
//        int[] arr = {};

        try {
            int max = getMax(arr);
            System.out.println("max = " + max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // 定义一个方法, 用来获取数组中的最大值
    public static int getMax(int[] arr) {
        // 1. 检查数组是否为 null 或长度为 0
        if (arr == null || arr.length == 0) {
            // 可以选择抛出自定义异常或返回一个合理的默认值
            throw new IllegalArgumentException("数组不能为空");
        }

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
