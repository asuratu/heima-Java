package com.heima.odd;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建线程
        Thread t1 = new Thread(new OddNumberPrinter(), "printer1");
        Thread t2 = new Thread(new OddNumberPrinter(), "printer2");

        // 启动线程
        t1.start();
        t2.start();
    }

}
