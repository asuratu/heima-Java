package com.heima.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Demo2
 * @Description Demo2
 * @Author AsuraTu
 * @Date 2024/9/20
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建一个有上限的线程池
        try (ExecutorService pool1 = Executors.newFixedThreadPool(3)) {
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
