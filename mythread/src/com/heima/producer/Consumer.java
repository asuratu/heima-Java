package com.heima.producer;

import java.util.concurrent.BlockingQueue;

/**
 * @ClassName Consumer
 * @Description 消费者
 * @Author AsuraTu
 * @Date 2024/9/19
 */
class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // 从队列中取出数据，如果队列为空，会等待
                Integer item = queue.take();
                System.out.println("消费者消费了: " + item);

                // 模拟消费过程的时间, 可能会忙等待, 忙等待是指线程一直循环，不做任何事情，只反复的检查条件是否满足
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            // 恢复中断状态，确保调用者能够感知到线程被中断
            Thread.currentThread().interrupt();
            System.out.println("消费者线程被中断，退出");
        } finally {
            // 可以在这里做一些清理工作
            System.out.println("消费者线程已终止");
        }
    }
}
