package com.heima.process;

public class DoWhileDemo {
    public static void main(String[] args) {
        // do...while 循环
        // do {
        //     循环体语句;
        // } while (条件语句);
        // 1. 循环体语句: 循环体语句, 循环体语句执行完毕, 再次判断条件语句, 直到条件语句为 false, 循环结束
        // 2. 条件语句: 循环条件, 循环变量的值是否满足条件

        // 需求: 打印 1 ~ 10 之间的所有整数
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
