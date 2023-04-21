package com.heima.demo;

/**
 * @ClassName Test
 * @Description com.heima.demo.Test
 * @Author AsuraTu
 * @Date 2023/4/21 16:16
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 需求：写一个Javabean类描述汽车。
        // 属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
        // 内部类的访问特点：
        // 内部类可以直接访问外部类的成员，包括私有
        // 外部类要访问内部类的成员，必须创建对象

        Car c = new Car("奔驰", "黑色", 3);
        c.engine = c.new Engine("奔驰发动机", 3);
        c.show();
    }
}
