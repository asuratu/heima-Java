package com.heima.test;

public class Phone {
    // 属性
    String brand;
    int price;

    // 方法
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("使用" + brand + "品牌" + price + "元的手机给所有人发短信");
    }
}
