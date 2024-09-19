package com.heima.deadlock;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class MyThread extends Thread {
    // 1. 死锁是指两个或两个以上的线程在执行过程中，因争夺资源而造成的一种互相等待的现象，若无外力作用，它们都将无法推进下去。
    // 避免锁嵌套

    static final Object LOCK1 = new Object();
    static final Object LOCK2 = new Object();

    @Override
    public void run() {
        while (true) {
            if ("Thread-0".equals(Thread.currentThread().getName())) {
                synchronized (LOCK1) {
                    System.out.println(Thread.currentThread().getName() + " get LOCK1");
                    synchronized (LOCK2) {
                        System.out.println(Thread.currentThread().getName() + " get LOCK2, finished");
                    }
                }
            } else {
                synchronized (LOCK2) {
                    System.out.println(Thread.currentThread().getName() + " get LOCK2");
                    synchronized (LOCK1) {
                        System.out.println(Thread.currentThread().getName() + " get LOCK1, finished");
                    }
                }
            }
        }
    }
}
