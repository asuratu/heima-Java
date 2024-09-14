package com.heima.demo9;

/**
 * @ClassName TableTennisCoach
 * @Description 乒乓球教练
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public class TableTennisCoach extends Coach implements Speak {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球！");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语!");
    }
}
