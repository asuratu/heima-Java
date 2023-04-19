package com.heima.demo2;

/**
 * @ClassName Test
 * @Description com.heima.demo2.Test
 * @Author AsuraTu
 * @Date 2023/4/19 17:11
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", 3);
        d.eat();
        d.drink();

        Frog f = new Frog("青蛙", 1);
        f.eat();
        f.drink();

        Sheep s = new Sheep("羊", 2);
        s.eat();
        s.drink();
    }
}
