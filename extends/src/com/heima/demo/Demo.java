package com.heima.demo;

/**
 * @ClassName Demo
 * @Description com.heima.demo.Demo
 * @Author AsuraTu
 * @Date 2023/4/17 17:41
 * @Version 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        // 布偶猫的行为
        System.out.println("布偶猫的行为");
        RagdollCat ragdollCat = new RagdollCat();
        ragdollCat.eat();
        ragdollCat.drink();
        ragdollCat.catchMouse();

        System.out.println("==========================");

        // 中国狸猫的行为
        System.out.println("中国狸猫的行为");
        CivetCats civetCats = new CivetCats();
        civetCats.eat();
        civetCats.drink();
        civetCats.catchMouse();

        System.out.println("==========================");

        // 哈士奇的行为
        System.out.println("哈士奇的行为");
        HuskyDog huskyDog = new HuskyDog();
        huskyDog.eat();
        huskyDog.drink();
        huskyDog.guard();
        huskyDog.breakHouse();

        System.out.println("==========================");

        // 泰迪的行为
        System.out.println("泰迪的行为");
        TeddyDog teddyDog = new TeddyDog();
        teddyDog.eat();
        teddyDog.drink();
        teddyDog.guard();
        teddyDog.rub();

        System.out.println("==========================");

        // 猫的静态方法
        Cat.sleep();
        Animal.sleep();
    }
}
