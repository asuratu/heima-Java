package com.heima.demo3;

/**
 * @ClassName Test
 * @Description com.heima.demo3.Test
 * @Author AsuraTu
 * @Date 2023/4/20 16:17
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("张三", 30);
        System.out.println("篮球教练, 姓名: " + bc.getName() + ", 年龄: " + bc.getAge());
        bc.Teach();

        System.out.println("----------");

        BasketballPlayer bp = new BasketballPlayer("李四", 20);
        System.out.println("篮球运动员, 姓名: " + bp.getName() + ", 年龄: " + bp.getAge());
        bp.playBall();

        System.out.println("----------");

        TableTennisCoach tc = new TableTennisCoach("王五", 40);
        System.out.println("乒乓球教练, 姓名: " + tc.getName() + ", 年龄: " + tc.getAge());
        tc.Teach();
        tc.speakEnglish();

        System.out.println("----------");

        TableTennisPlayer tp = new TableTennisPlayer("赵六", 25);
        System.out.println("乒乓球运动员, 姓名: " + tp.getName() + ", 年龄: " + tp.getAge());
        tp.playBall();
        tp.speakEnglish();
    }
}
