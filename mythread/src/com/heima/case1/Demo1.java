package com.heima.case1;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 自定义一个线程类, 继承 Thread 类
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        // 当前线程的优先级, 默认是 5
        System.out.println("当前线程的优先级：" + Thread.currentThread().getPriority());

        // 设置线程的优先级, 范围是 1~10, 10 最高优先级
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);

        // 设置为守护线程, 主线程结束后, 守护线程也会结束
        myThread2.setDaemon(true);

        // 启动线程
        myThread1.start();
        myThread2.start();
    }

}
