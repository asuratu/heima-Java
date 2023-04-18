package com.heima.demo2;

/**
 * @ClassName Cat
 * @Description com.heima.demo2.Cat
 * @Author AsuraTu
 * @Date 2023/4/18 17:28
 * @Version 1.0.0
 */
public class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("我是一只猫, 我叫" + name);
    }
}
