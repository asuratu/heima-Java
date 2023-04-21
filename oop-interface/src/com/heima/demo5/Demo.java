package com.heima.demo5;

/**
 * @ClassName Demo
 * @Description com.heima.demo5.Demo
 * @Author AsuraTu
 * @Date 2023/4/21 14:33
 * @Version 1.0.0
 */
public class Demo implements Inter {
    // show
    // 重写接口中的默认方法
    public static void show() {
        System.out.println("demo show");
    }

    @Override
    public void method() {
        System.out.println("重写了 method 方法");
    }
}
