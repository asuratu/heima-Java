package com.heima.case3;

import java.util.concurrent.Callable;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class MyCallable implements Callable<Integer> {
    // 1. 自定义线程类，实现 Callable<V> 接口, 其中 泛型 V 表示线程执行的结果类型
    // 2. 重写 call() 方法，实现线程执行的逻辑，并返回执行结果, 类型为泛型 V
    @Override
    public Integer call() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }
}
