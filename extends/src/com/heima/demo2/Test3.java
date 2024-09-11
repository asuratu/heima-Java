package com.heima.demo2;

/**
 * @ClassName Test3
 * @Description com.heima.demo2.Test2
 * @Author AsuraTu
 * @Date 2023/4/18 10:32
 * @Version 1.0.0
 */
public class Test3 {
    public static void main(String[] args) {
        Zi2 z = new Zi2();
        z.show();
    }
}

class Fu2 {
    String name = "Fu1";
    String hobby = "reading";

    public void dance() {
        System.out.println("Fu2 show");
    }
}

class Zi2 extends Fu2 {
    String name = "Zi1";
    String game = "swimming";


    @Override
    public void dance() {
        System.out.println("Zi2 show");
    }

    public void show() {
        // 打印 Fu2 的 name
        System.out.println(super.name);
        // 打印 Zi2 的 name
        System.out.println(this.name);
        // 打印 Fu2 的 hobby
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        // 打印 Zi2 的 game
        System.out.println(this.game);
        // 调用 Fu2 的方法
        super.dance();
        // 调用 Zi2 的方法
        this.dance();
    }
}
