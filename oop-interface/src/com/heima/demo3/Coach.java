package com.heima.demo3;

/**
 * @ClassName Athlete
 * @Description com.heima.demo3.Athlete
 * @Author AsuraTu
 * @Date 2023/4/20 16:03
 * @Version 1.0.0
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void Teach();
}
