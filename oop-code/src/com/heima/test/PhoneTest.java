package com.heima.test;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        p.brand = "苹果";
        p.price = 8888;

        // 调用方法
        p.call("张三");
        p.sendMessage();
    }
}
