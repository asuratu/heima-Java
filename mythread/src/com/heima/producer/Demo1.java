package com.heima.producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建一个容量为5的阻塞队列
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // 启动生产者和消费者线程
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }

}
