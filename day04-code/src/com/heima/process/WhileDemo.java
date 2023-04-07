package com.heima.process;

public class WhileDemo {
    public static void main(String[] args) {
        // while 循环
        // while (条件语句) {
        //     循环体语句;
        // }
        // 1. 条件语句: 循环条件, 循环变量的值是否满足条件
        // 2. 循环体语句: 循环体语句, 循环体语句执行完毕, 再次判断条件语句, 直到条件语句为 false, 循环结束

        // 需求: 打印 1 ~ 10 之间的所有整数
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }
}
