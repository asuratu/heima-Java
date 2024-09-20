package com.heima.demo;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class MyRunnable implements Runnable {
    // 1. 自定义线程类，实现Runnable接口
    // 2. 重写run()方法，在run()方法中实现线程的逻辑
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
