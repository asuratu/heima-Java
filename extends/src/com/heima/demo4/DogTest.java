package com.heima.demo4;

/**
 * @ClassName DogTest
 * @Description com.heima.demo4.DogTest
 * @Author AsuraTu
 * @Date 2023/4/18 14:49
 * @Version 1.0.0
 */
public class DogTest {
    public static void main(String[] args) {
        // 哈士奇的行为
        System.out.println("哈士奇的行为");
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        System.out.println("----------");

        // 沙皮狗的行为
        System.out.println("沙皮狗的行为");
        ShaPi shaPi = new ShaPi();
        shaPi.eat();
        shaPi.drink();
        shaPi.lookHome();

        System.out.println("----------");

        // 中华田园狗的行为
        System.out.println("中华田园狗的行为");
        Garden garden = new Garden();
        garden.eat();
        garden.drink();
        garden.lookHome();

        System.out.println("----------");
    }
}
