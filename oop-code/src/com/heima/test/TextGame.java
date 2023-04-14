package com.heima.test;

public class TextGame {
    // 角色名称
    private final String name;
    // q: final 是什么
    // a: final 是一个关键字, 用来修饰类, 方法, 变量
    //    修饰类: 该类不能被继承
    //    修饰方法: 该方法不能被重写
    //    修饰变量: 该变量是一个常量, 只能赋值一次, 之后不能再修改
    // q: 为什么要用 final 修饰变量
    // a: 为了保证变量的值不会被修改, 从而保证数据的安全性
    // 血量
    private int blood;

    public TextGame(String name) {
        this.name = name;
    }

    public TextGame(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 攻击
    public void attack(TextGame r) {
        // r: 被攻击的角色
        // this: 攻击的角色
        // r.blood = r.blood - 10;
        r.setBlood(r.getBlood() - 10);
        System.out.println(this.name + "攻击了" + r.name + ", " + r.name + "剩余血量:" + r.blood);
    }

    // 判断角色是否死亡
    public boolean isDead() {
        return this.blood <= 0;
    }
}
