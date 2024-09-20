package com.heima.notify;

import java.util.Queue;

/**
 * @ClassName Producer
 * @Description 生产者
 * @Author AsuraTu
 * @Date 2024/9/19
 */

class Producer implements Runnable {
    private final Queue<Integer> queue;
    private final int MAX_SIZE;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.MAX_SIZE = maxSize;
    }

    @Override
    public void run() {
        int value = 0;
        while (value < 10) {
            synchronized (queue) {
                // 当队列满时，等待消费者消费
                while (queue.size() == MAX_SIZE) {
                    try {
                        System.out.println("队列已满，生产者等待...");
                        queue.wait();  // 生产者等待，直到被通知
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 生产数据
                System.out.println("生产者生产了: " + value);
                queue.add(value++);

                // 唤醒等待的消费者
                queue.notifyAll();

                try {
                    // 模拟生产过程的时间
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
