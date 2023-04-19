package com.heima.demo4;

/**
 * @ClassName Cat
 * @Description com.heima.demo3.Cat
 * @Author AsuraTu
 * @Date 2023/4/19 09:54
 * @Version 1.0.0
 */
public class Cat extends Animal {
    public Cat(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(age + "岁的" + color + "色的猫眯着眼睛侧着头吃" + food);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
