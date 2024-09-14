package com.heima.demo9;

/**
 * @ClassName BasketballPlayer
 * @Description 篮球运动员类
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("学打篮球！");
    }
}
