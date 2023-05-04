package com.heima.demo;

/**
 * @ClassName Test4
 * @Description com.heima.demo.Test4
 * @Author AsuraTu
 * @Date 2023/5/4 16:11
 * @Version 1.0.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！以后每天猴子都吃当前剩下来的一半，然后
        // 再多吃一个，第10天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？

        // 1.定义一个变量，用来存储桃子的数量
        int peach = getCount(1);
        // 4.打印桃子的数量
        System.out.println("最初的桃子数量是：" + peach);
    }

    public static int getCount(int n) {
        if (n == 10) {
            return 1;
        }
        return (getCount(n + 1) + 1) * 2;
    }
}
