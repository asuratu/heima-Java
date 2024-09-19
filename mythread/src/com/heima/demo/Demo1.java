package com.heima.demo;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建3个售票员线程，编号分别为1, 2, 3
        Thread t1 = new Thread(new TicketSeller(1), "售票员1");
        Thread t2 = new Thread(new TicketSeller(2), "售票员2");
        Thread t3 = new Thread(new TicketSeller(3), "售票员3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }

}
