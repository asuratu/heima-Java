package com.heima.redpacket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName RedPacketDemo
 * @Description RedPacketDemo
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class RedPacketDemo {
    // 总金额
    private static final double TOTAL_MONEY = 100.0;
    // 红包个数
    private static final int RED_PACKET_COUNT = 3;
    // 创建一个锁对象，保证线程安全
    private static final Lock LOCK = new ReentrantLock();
    // 红包列表，存储每个红包的金额
    private static final List<Double> RED_PACKETS = new ArrayList<>();
    // 倒计时锁
    private static final CountDownLatch START = new CountDownLatch(1);

    // 初始化红包
    static {
        Random random = new Random();
        double remainingMoney = TOTAL_MONEY;
        for (int i = 0; i < RED_PACKET_COUNT - 1; i++) {
            // 随机分配一个金额
            // 保留两位小数
            double money = Math.round((random.nextDouble() * remainingMoney / 2) * 100.0) / 100.0;
            RED_PACKETS.add(money);
            remainingMoney -= money;
        }
        // 最后一个红包拿剩下的钱
        RED_PACKETS.add(Math.round(remainingMoney * 100.0) / 100.0);
        Collections.addAll(RED_PACKETS, 0.0, 0.0);

        // 打乱红包顺序
        Collections.shuffle(RED_PACKETS);
        System.out.println(RED_PACKETS);
    }

    public static void main(String[] args) {
        // 创建 5 个线程模拟 5 个人抢红包
        Thread t1 = new Thread(new Person("小明"));
        Thread t2 = new Thread(new Person("小红"));
        Thread t3 = new Thread(new Person("小强"));
        Thread t4 = new Thread(new Person("小花"));
        Thread t5 = new Thread(new Person("小黑"));

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // 释放所有线程同时开始抢红包
        START.countDown();
    }

    // 模拟一个人去抢红包
    static class Person implements Runnable {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                // 等待主线程的倒计时结束，确保所有线程一起开始
                START.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            LOCK.lock();  // 获取锁，保证线程安全

            try {
                Thread.sleep(100); // 模拟抢红包的延迟
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            try {
                if (!RED_PACKETS.isEmpty()) {
                    // 抢红包
                    // 取出一个红包
                    double money = RED_PACKETS.removeFirst();
                    System.out.println(name + " 抢到了 " + money + " 元");
                } else {
                    // 如果没有红包了
                    System.out.println(name + " 没抢到红包");
                }
            } finally {
                LOCK.unlock();  // 释放锁
                Thread.currentThread().interrupt();
            }
        }
    }
}