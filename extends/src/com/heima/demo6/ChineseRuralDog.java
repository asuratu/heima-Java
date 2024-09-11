package com.heima.demo6;

/**
 * @ClassName ChineseRuralDog
 * @Description 中华田园犬
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class ChineseRuralDog extends Dog {
    public ChineseRuralDog() {
        System.out.println("子类被创建");
    }

    @Override
    public void eat() {
        System.out.println("吃饭(吃剩饭)");
    }
}
