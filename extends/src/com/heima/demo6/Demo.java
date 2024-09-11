package com.heima.demo6;

/**
 * @ClassName Demo
 * @Description Demo
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("哈士奇的行为: ");
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.destroy();

        System.out.println("沙皮狗的行为: ");
        ShariPei shariPei = new ShariPei();
        shariPei.eat();
        shariPei.drink();
        shariPei.lookHome();

        System.out.println("中华田园犬的行为: ");
        ChineseRuralDog chineseRuralDog = new ChineseRuralDog();
        chineseRuralDog.eat();
        chineseRuralDog.drink();
        chineseRuralDog.lookHome();
    }
}
