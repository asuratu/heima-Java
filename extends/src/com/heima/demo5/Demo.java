package com.heima.demo5;

/**
 * @ClassName Demo
 * @Description Demo
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("布偶猫的行为: ");
        RagdollCat ragdollCat = new RagdollCat();
        ragdollCat.eat();
        ragdollCat.drink();
        ragdollCat.catchMouse();


        System.out.println("狸猫的行为: ");
        TanukiCat tanukiCat = new TanukiCat();
        tanukiCat.eat();
        tanukiCat.drink();
        tanukiCat.catchMouse();


        System.out.println("哈士奇的行为: ");
        HuskyDog huskyDog = new HuskyDog();
        huskyDog.eat();
        huskyDog.drink();
        huskyDog.cut();
        huskyDog.watch();

        System.out.println("泰迪的行为: ");
        TeddyDog teddyDog = new TeddyDog();
        teddyDog.eat();
        teddyDog.drink();
        teddyDog.watch();
        teddyDog.rub();

    }
}
