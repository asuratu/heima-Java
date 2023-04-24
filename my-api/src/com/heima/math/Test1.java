package com.heima.math;

import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description com.heima.math.Test1
 * @Author AsuraTu
 * @Date 2023/4/24 16:31
 * @Version 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        // 判断一个数是否为质数 (使用 Math 类的方法)
        // 质数：只能被1和它本身整除的数

        // 1. 定义一个变量
        while (true) {
            // 请输入一个数
            System.out.println("请输入一个数：");
            int num = new Scanner(System.in).nextInt();
            // 2. 定义一个变量，用来记录是否为质数
            boolean flag = true;
            // 3. 循环判断
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            // 4. 输出结果
            if (flag) {
                System.out.println(num + "是质数");
            } else {
                System.out.println(num + "不是质数");
            }
        }
    }
}
