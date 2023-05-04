package com.heima.demo;

/**
 * @ClassName Test5
 * @Description com.heima.demo.Test5
 * @Author AsuraTu
 * @Date 2023/5/4 16:19
 * @Version 1.0.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶, 有的时候一次爬三个台阶
        // 如果这个楼梯有20个台阶，小明一共有多少种爬法

        // 1.定义一个变量，用来存储爬楼梯的方法
        int count = getCount(7);
        // 2.打印爬楼梯的方法
        System.out.println("爬楼梯的方法有：" + count + "种");
    }

    private static int getCount(int i) {
        if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        } else if (i == 3) {
            return 4;
        } else {
            return getCount(i - 1) + getCount(i - 2) + getCount(i - 3);
        }
    }
}
