package com.heima.demo6;

/**
 * @ClassName Husky
 * @Description 哈士奇
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Husky extends Dog {
    public Husky() {
        System.out.println("子类被创建");
    }

    @Override
    public void eat() {
        System.out.println("吃饭(吃狗粮)");
    }

    public void destroy() {
        System.out.println("拆家");
    }
}
