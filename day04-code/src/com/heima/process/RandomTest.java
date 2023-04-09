package com.heima.process;

import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        // 需求: 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
        // 保底3次机会，如果第三次一定提示提示“恭喜答对了！”

        // 1. 生成一个随机数
        int random = (int) (Math.random() * 100 + 1);
        System.out.println("random = " + random);

        // 2. 猜数字
        int i = 1;
        int t = 3;
        while (true) {
            // 2.1 提示用户输入
            System.out.println("请输入一个1-100之间的整数");
            // 2.2 接收用户输入
            int num = new Scanner(System.in).nextInt();

            if (i == t) {
                System.out.println("恭喜答对了！");
                break;
            }

            // 2.3 判断用户输入是否正确
            if (num > random) {
                System.out.println("猜大了");
            } else if (num < random) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
            i++;
        }

    }
}
