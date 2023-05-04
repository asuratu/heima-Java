package com.heima.demo;

/**
 * @ClassName Demo1
 * @Description com.heima.demo.Demo1
 * @Author AsuraTu
 * @Date 2023/4/27 16:23
 * @Version 1.0.0
 */
public class Demo1 {
    public static void main(String[] args) {
        // Lambda 表达式的注意点
        // 1. 只能简化函数式接口的的匿名内部类的写法
        // 1.1 函数式接口: 只有一个抽象方法的接口, 接口上可以使用 @FunctionalInterface 注解标识
        // 2. 如果 Lambda 表达式的方法体中只有一行代码, 那么可以省略大括号

        // 匿名内部类的写法
//        method(new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("游泳");
//            }
//        });

        // lambda 表达式的写法
        method(s -> System.out.println("游泳11" + s));
    }

    public static void method(Swim s) {
        s.swimming("游泳");
    }
}
