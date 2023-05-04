package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName test
 * @Description com.heima.test.test
 * @Author AsuraTu
 * @Date 2023/4/27 09:17
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 键盘录入 1-100 之间的整数, 添加到集合
        // 如果集合中的所有数据之和超过 200, 那么停止录入

        // 集合
        ArrayList<Integer> list = new ArrayList<>();

        // 总和
        int sum = 0;

        do {
            // 请输入 1-100 之间的整数
            System.out.println("请输入 1-100 之间的整数");
            // 键盘录入
            Scanner sc = new Scanner(System.in);
            // 判断
            if (!sc.hasNextInt()) {
                System.out.println("输入的不是整数");
                continue;
            }

            int num = sc.nextInt();

            // 判断是否在 1-100 之间
            if (num >= 1 && num <= 100) {
                // 添加到集合
                list.add(num); // 自动装箱
                // 相当于
                // list.add(Integer.valueOf(num));
            } else {
                System.out.println("输入的数据不在 1-100 之间");
                continue;
            }

            // 判断集合中的所有数据之和是否超过 200
            sum += num;

            // 打印 sum
            System.out.println("sum = " + sum);
        } while (sum < 200);

        // 输出集合
        System.out.println(list);
    }
}
