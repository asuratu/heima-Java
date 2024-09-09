package com.heima.test;

// javabean 类, 用来描述事物的类
public class Phone {
    // 属性, 一般都是名词
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public static double getAvgPrice(Phone[] phones) {
        if (phones == null || phones.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        return sum / phones.length;
    }

    // 方法, 一般都是动词
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("使用" + brand + "品牌" + price + "元的手机给所有人发短信");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
