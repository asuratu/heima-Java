package com.heima.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/20
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建一个无界线程池
        try (ExecutorService pool1 = Executors.newCachedThreadPool()) {
//            for (int i = 0; i < 10; i++) {
//                pool1.execute(() -> System.out.println(Thread.currentThread().getName() + " is running"));
//            }
            pool1.submit(new MyRunnable());
            Thread.sleep(1000);
            pool1.submit(new MyRunnable());
            Thread.sleep(1000);
            pool1.submit(new MyRunnable());
            Thread.sleep(1000);
            pool1.submit(new MyRunnable());

            pool1.shutdown(); // 关闭线程池，不再接收新的任务
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
