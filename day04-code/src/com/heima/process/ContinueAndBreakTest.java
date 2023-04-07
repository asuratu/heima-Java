package com.heima.process;

public class ContinueAndBreakTest {
    public static void main(String[] args) {
        // 朋友聚会的时候可能会玩一个游戏：逢7过
        // 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍
        // 数时都要说过：过
        // 需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据

        // 1. 定义变量, 用于存储 1-100 之间的数字
        int i = 1;
        // 2. 循环遍历 1-100 之间的数字
        while (i <= 100) {
            // 3. 判断数字是否包含 7 或者是 7 的倍数
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // 4. 如果是, 打印过
                System.out.println("过");
            } else {
                // 5. 如果不是, 打印数字
                System.out.println(i);
            }
            // 6. 循环变量的变化
            i++;
        }

    }
}
