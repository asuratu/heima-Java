package com.heima.demo3;

/**
 * @ClassName TableTennisPlayer
 * @Description com.heima.demo3.TableTennisPlayer
 * @Author AsuraTu
 * @Date 2023/4/20 16:12
 * @Version 1.0.0
 */
public class TableTennisPlayer extends Athlete implements SpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBall() {
        System.out.println("打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
