package com.heima.demo9;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("篮球教练信息：");
        BasketballCoach basketballCoach = new BasketballCoach("李教练", 40);
        System.out.println(basketballCoach);
        basketballCoach.teach();
        System.out.println("篮球运动员信息：");
        BasketballPlayer basketballPlayer = new BasketballPlayer("李运动员", 25);
        System.out.println(basketballPlayer);
        basketballPlayer.play();

        System.out.println("----------");

        System.out.println("乒乓球教练信息：");
        TableTennisCoach tableTennisCoach = new TableTennisCoach("张教练", 38);
        System.out.println(tableTennisCoach);
        tableTennisCoach.teach();
        tableTennisCoach.speakEnglish();
        System.out.println("乒乓球运动员信息：");
        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("张运动员", 25);
        System.out.println(tableTennisPlayer);
        tableTennisPlayer.play();
        tableTennisPlayer.speakEnglish();


    }
}
