package com.heima.demo3;

/**
 * @ClassName TableTennisCoach
 * @Description com.heima.demo3.TableTennisCoach
 * @Author AsuraTu
 * @Date 2023/4/20 16:15
 * @Version 1.0.0
 */
public class TableTennisCoach extends Coach implements SpeakEnglish {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
