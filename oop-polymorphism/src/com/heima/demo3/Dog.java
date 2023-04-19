package com.heima.demo3;

/**
 * @ClassName Dog
 * @Description com.heima.demo3.Dog
 * @Author AsuraTu
 * @Date 2023/4/19 09:54
 * @Version 1.0.0
 */
public class Dog extends Animal {
    String name = "狗";

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
