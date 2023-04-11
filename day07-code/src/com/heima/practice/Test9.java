package com.heima.practice;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        // 双色球
        // 需求：
        // 1. 生成一个双色球号码，要求是6个红球（1-33之间的随机数，不能重复）+1个蓝球（1-16之间的随机数）
        // 2. 将生成的双色球号码打印到控制台

        // 1. 创建一个数组, 用来存储33个红球
        int[] redOrigin = new int[33];

        // 2. 给数组中的元素赋值
        for (int i = 0; i < redOrigin.length; i++) {
            redOrigin[i] = i + 1;
        }

        // 3. 将33个红球随机打乱顺序
        for (int i = 0; i < 6; i++) {
            // 生成随机索引
            int index = (int) (Math.random() * redOrigin.length);
            // 交换元素
            int temp = redOrigin[i];
            redOrigin[i] = redOrigin[index];
            redOrigin[index] = temp;
        }

        // 4. 创建一个数组, 用来存储6个红球
        int[] red = new int[6];

        // 5. 将前6个元素赋值给red数组
        System.arraycopy(redOrigin, 0, red, 0, red.length);

        // 6. 获取蓝球
        int blue = (int) (Math.random() * 16) + 1;

        // 7. 将红球和蓝球打印到控制台
        System.out.println("红球: " + Arrays.toString(red));
        System.out.println("蓝球: " + blue);
    }
}
