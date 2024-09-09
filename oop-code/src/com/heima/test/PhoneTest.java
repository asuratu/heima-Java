package com.heima.test;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone("苹果", 6666);

        // 调用方法
        p.call("张三");
        p.sendMessage();

        Phone p2 = new Phone("小米", 5555);
        p2.setBrand("华为");

        Phone[] phones = {p, p2};
        double avgPrice = Phone.getAvgPrice(phones);
        System.out.println("平均价格：" + avgPrice);

    }

}
