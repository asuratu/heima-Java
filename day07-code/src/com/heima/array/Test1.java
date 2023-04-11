package com.heima.array;

public class Test1 {
    public static void main(String[] args) {
        // 二维数组的练习
        // 某商城每个季度的营业额如下：单位（万元）
        // 第一季度：22,66,44
        // 第二季度：77,33,88
        // 第三季度：25,45,65
        // 第四季度：11,66,99
        // 要求计算出每个季度的总营业额和全年的总营业额

        // 1. 定义一个二维数组
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        // 3. 定义一个变量, 用来存储全年的总营业额
        int total = 0;
        // 4. 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            // 2. 定义一个变量, 用来存储每个季度的总营业额
            int sum = getSum(arr[i]);
            // 7. 输出每个季度的总营业额
            System.out.println("第" + (i + 1) + "季度的总营业额为: " + sum);
            // 8. 累加全年的总营业额
            total += sum;
        }
        // 9. 输出全年的总营业额
        System.out.println("全年的总营业额为: " + total);
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            // 6. 累加每个季度的总营业额
            sum += i;
        }
        return sum;
    }
}
