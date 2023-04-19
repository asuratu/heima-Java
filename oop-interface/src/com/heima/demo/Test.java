package com.heima.demo;

/**
 * @ClassName Test
 * @Description com.heima.demo.Test
 * @Author AsuraTu
 * @Date 2023/4/19 18:24
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 1);
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("兔子", 2);
        r.eat();

        Dog d = new Dog("旺财", 3);
        d.eat();
        d.swim();
    }
}
