package com.heima.demo9;

/**
 * @ClassName TableTennisPlayer
 * @Description 乒乓球运动员
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public class TableTennisPlayer extends Player implements Speak {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
