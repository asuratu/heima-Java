package com.heima.demo5;

/**
 * @ClassName Outer
 * @Description com.heima.demo5.Outer
 * @Author AsuraTu
 * @Date 2023/4/21 17:54
 * @Version 1.0.0
 */
public class Outer {
    int a = 10;

    // 局部内部类
    public void show() {
        // 局部内部类 等价与 局部变量
        int b = 20;
        class Inner {
            String name;
            int age;

            public static void method2() {
                System.out.println("局部内部类的method2方法");
            }

            public void method1() {
                System.out.println("局部内部类的method1方法");
            }
        }

        Inner i = new Inner();
        i.name = "张三";
        i.age = 20;
        i.method1();
        Inner.method2();


    }

}
