package com.heima.arrayDemo;

import java.util.Arrays;

public class ArrayTest5 {
    public static void main(String[] args) {
        // 需求：生成10个1~100之间的随机数存入数组。
        // 1）求出所有数据的和
        // 2）求所有数据的平均数
        // 3）统计有多少个数据比平均值小

        // 1. 定义一个数组
        int[] arr = new int[10]; // 10个元素的数组
        // 2. 生成随机数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        // 3. 求和
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        // 4. 求平均数
        double avg = (double) sum / arr.length;
        // 5. 统计有多少个数据比平均值小
        int count = 0;
        for (int j : arr) {
            if (j < avg) {
                count++;
            }
        }
        // 6. 输出结果
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("count = " + count);
    }
}
