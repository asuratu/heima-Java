package com.heima.test;

// javabean 类, 用来描述事物的类
public class Phone {
    // 属性, 一般都是名词
    String brand;
    double price;

    // 方法, 一般都是动词
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("使用" + brand + "品牌" + price + "元的手机给所有人发短信");
    }
}
