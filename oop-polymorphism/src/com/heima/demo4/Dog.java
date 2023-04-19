package com.heima.demo4;

/**
 * @ClassName Dog
 * @Description com.heima.demo3.Dog
 * @Author AsuraTu
 * @Date 2023/4/19 09:54
 * @Version 1.0.0
 */
public class Dog extends Animal {
    public Dog(String age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(age + "岁的" + color + "色的狗两条前腿紧紧的抱住" + food + "，一口一口的吃");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
