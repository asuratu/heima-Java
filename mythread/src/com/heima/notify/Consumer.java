package com.heima.notify;

import java.util.Queue;

/**
 * @ClassName Consumer
 * @Description 消费者
 * @Author AsuraTu
 * @Date 2024/9/19
 */
class Consumer implements Runnable {
    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                // 当队列为空时，等待生产者生产
                while (queue.isEmpty()) {
                    try {
                        System.out.println("队列为空，消费者等待...");
                        queue.wait();  // 消费者等待，直到被通知
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 消费数据
                int value = queue.poll();
                System.out.println("消费者消费了: " + value);

                // 唤醒等待的生产者
                queue.notifyAll();

                try {
                    Thread.sleep(150);  // 模拟消费过程的时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
