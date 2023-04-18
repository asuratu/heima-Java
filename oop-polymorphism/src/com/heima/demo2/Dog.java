package com.heima.demo2;

/**
 * @ClassName Dog
 * @Description com.heima.demo2.Dog
 * @Author AsuraTu
 * @Date 2023/4/18 17:25
 * @Version 1.0.0
 */
public class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("我是一只狗, 我叫" + name);
    }
}
