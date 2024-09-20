package com.heima.producer;

import java.util.concurrent.BlockingQueue;

/**
 * @ClassName Producer
 * @Description 生产者
 * @Author AsuraTu
 * @Date 2024/9/19
 */
class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println("生产者生产了: " + i);
                // 放入队列中，如果队列满了，会等待消费者消费
                // 判断队列的长度
                if (queue.size() == 5) {
                    System.out.println("队列满了，生产者等待 ...");
                }
                queue.put(i);
                // 模拟生产过程的时间
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
