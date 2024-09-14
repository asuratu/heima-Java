package com.heima.demo9;

/**
 * @ClassName Coach
 * @Description 教练类
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
