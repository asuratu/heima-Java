package com.heima.notify;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        // 使用LinkedList作为队列
        Queue<Integer> queue = new LinkedList<>();

        // 创建生产者和消费者
        Thread producerThread = new Thread(new Producer(queue, MAX_SIZE));
        Thread consumerThread = new Thread(new Consumer(queue));

        // 启动线程
        producerThread.start();
        consumerThread.start();
    }
}
