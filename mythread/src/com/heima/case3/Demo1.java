package com.heima.case3;

import java.util.concurrent.FutureTask;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 这种方式可以获取到 run 方法的返回值

        // 创建 MyCallable 对象, 表示多线程要执行的任务
        MyCallable myCallable1 = new MyCallable();

        // 创建 FutureTask 对象, 用于管理多线程的运行结果
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable1);

        // 创建线程, 并将 FutureTask 对象作为线程的 Runnable 对象
        Thread thread1 = new Thread(futureTask);

        // 启动线程
        thread1.start();

        // 获取线程的运行结果
        try {
            int result = futureTask.get();
            System.out.println("线程的运行结果为: " + result);
        } catch (Exception e) {
            System.out.println("线程的运行结果获取失败!");
        }
    }

}
