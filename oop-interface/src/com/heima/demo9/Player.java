package com.heima.demo9;

/**
 * @ClassName Player
 * @Description 运动员类
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void play();
}
