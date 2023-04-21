package com.heima.demo2;

/**
 * @ClassName Test
 * @Description com.heima.demo2.Test
 * @Author AsuraTu
 * @Date 2023/4/21 16:48
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 编写成员内部类的注意点：
        //  1.成员内部类可以被一些修饰符所修饰，比如：private, 默认，protected, public, static等
        //  2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
        // 获取成员内部类对象的两种方式：
        //  方式一：外部类编写方法，对外提供内部类对象
        //  方式二：直接创建
        //   格式：外部类名.内部类名 对象名=外部类对象.内部类对象；
        //   范例：Outer.Inner oi = new Outer(). new Inner()；
    }
}
