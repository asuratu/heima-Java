package com.heima.demo3;

/**
 * @ClassName BasketballPlayer
 * @Description com.heima.demo3.BasketballPlayer
 * @Author AsuraTu
 * @Date 2023/4/20 16:16
 * @Version 1.0.0
 */
public class BasketballPlayer extends Athlete {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBall() {
        System.out.println("打篮球");
    }
}
