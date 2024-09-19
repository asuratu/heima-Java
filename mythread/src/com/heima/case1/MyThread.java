package com.heima.case1;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class MyThread extends Thread {
    // 1. 自定义线程类，继承Thread类
    // 2. 重写run()方法，在run()方法中实现线程的逻辑
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("线程异常：" + e.getMessage());
                return;
            }

            if (i == 10 && "Thread-0".equals(Thread.currentThread().getName())) {
                return;
            }

            // 出让线程执行权
//            Thread.yield();

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
