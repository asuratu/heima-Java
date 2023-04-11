package com.heima.practice;

public class Test8 {
    public static void main(String[] args) {
        // 抢红包
        // 需求：
        // 一个大V直播抽奖，奖品是现金红包，分别有(2, 588，888,1000,10000)五个奖金。请使用代码模拟抽奖，
        // 打印出每个奖项，奖项的出现顺序要随机且不重复。
        // 思路: 遍历数组, 每个元素都与随机索引的元素交换

        // 1. 定义一个数组, 用来存储奖金
        int[] arr = {2, 588, 888, 1000, 10000};

        // 2. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 3. 生成随机索引
            int index = (int) (Math.random() * arr.length);
            // 4. 交换元素
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        // 5. 输出数组
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
