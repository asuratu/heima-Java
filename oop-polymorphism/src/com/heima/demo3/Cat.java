package com.heima.demo3;

/**
 * @ClassName Cat
 * @Description com.heima.demo3.Cat
 * @Author AsuraTu
 * @Date 2023/4/19 09:54
 * @Version 1.0.0
 */
public class Cat extends Animal {
    String name = "猫";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
