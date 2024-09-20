package com.heima.odd;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class OddNumberPrinter implements Runnable {
    // 创建一个锁对象，保证线程同步
    private static final Object LOCK = new Object();
    // 共享的数字变量
    private static int number = 1;

    @Override
    public void run() {
        try {
            while (number <= 100) {
                synchronized (LOCK) {
                    // 只处理奇数
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " 打印奇数: " + number);
                        Thread.sleep(200);
                    }
                    number++;

                    // 唤醒其他线程
                    LOCK.notifyAll();

                    // 使当前线程等待，避免死循环
                    if (number <= 100) {
                        LOCK.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
    }
}
