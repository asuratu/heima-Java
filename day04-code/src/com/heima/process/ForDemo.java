package com.heima.process;

public class ForDemo {
    public static void main(String[] args) {
        // for 循环
        // for (初始化语句; 条件语句; 步进语句) {
        //     循环体语句;
        // }
        // 1. 初始化语句: 定义循环变量, 并赋值
        // 2. 条件语句: 循环条件, 循环变量的值是否满足条件
        // 3. 步进语句: 循环变量的变化
        // 4. 循环体语句: 循环体语句, 循环体语句执行完毕, 执行步进语句, 再次判断条件语句, 直到条件语句为 false, 循环结束

        // 需求: 打印 1 ~ 10 之间的所有整数
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        // 需求: 打印 1 ~ 10 之间的所有偶数
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("----------------------------");

        // 需求: 求和, 1 ~ 100 之间的所有偶数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
