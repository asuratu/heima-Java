package com.heima.demo1;

/**
 * @ClassName Test
 * @Description com.heima.demo1.Test
 * @Author AsuraTu
 * @Date 2023/4/20 15:29
 * @Version 1.0.0
 */
public class Test implements Inter1, Inter2 {
    @Override
    public void method1() { // Inter1 和 Inter2 都有 method1() 方法，这里重写一份即可
    }

    @Override
    public void method2() {
    }

    @Override
    public void method3() {
    }

    @Override
    public void method4() { // Inter2 中有 method4() 方法，这里需要重写
    }
}
