package com.heima.process;

public class DoWhileDemo {
    public static void main(String[] args) {
        // do...while 循环
        // do {
        //     循环体语句;1
        // } while (条件语句);
        // 1. 循环体语句: 循环体语句, 循环体语句执行完毕, 再次判断条件语句, 直到条件语句为 false, 循环结束
        // 2. 条件语句: 循环条件, 循环变量的值是否满足条件

        // 需求: 打印 1 ~ 10 之间的所有整数
        int i = 11;
        // do 的代码块先执行一次, 然后再判断条件语句, 直到条件语句为 false, 循环结束
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // 先判断条件语句, 然后再执行代码块, 直到条件语句为 false, 循环结束
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }
    }
}
