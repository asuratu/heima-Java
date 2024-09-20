package com.heima.gifts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Sender implements Runnable {
    // 总礼物数
    private static final int TOTAL_GIFTS = 100;
    // 创建一个锁对象，所有线程共享同一个锁
    private static final Lock LOCK = new ReentrantLock();
    // 剩余礼物数
    private static int gifts = TOTAL_GIFTS;

    public Sender() {
    }

    @Override
    public void run() {
        while (gifts >= 10) {
            sendGift();
        }
    }

    // 同步的售礼物方法，保证线程安全
    // 使用Lock来代替synchronized进行线程同步
    private void sendGift() {
        LOCK.lock();  // 获取锁
        try {
            if (gifts >= 10) {
                System.out.println(Thread.currentThread().getName() + " 送出第" + gifts-- + "个礼物，剩余礼物数：" + gifts);

                // 模拟送礼物的延迟
                Thread.sleep(200);
            } else {
                System.out.println("礼物数量不足，结束线程");
//                System.exit(0);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            LOCK.unlock();  // 确保在操作完成后释放锁
        }
    }
}
