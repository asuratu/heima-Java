package com.heima.gifts;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建2个人员送礼物的线程
        Thread t2 = new Thread(new Sender(), "人员2");
        Thread t1 = new Thread(new Sender(), "人员1");

        // 启动线程
        t2.start();
        t1.start();
    }

}
