package com.heima.demo6;

/**
 * @author asura
 */
public interface Inter1 {
    // 私有静态方法
    private static void method2() {
        System.out.println("Inter1 private static method2");
    }

    static void method3() {
        // 调用私有静态方法
        method2();
        System.out.println("Inter1 static method3");
    }

    // 私有方法
    private void method1() {
        System.out.println("Inter1 private method1");
    }

    default void method4() {
        // 调用私有方法
        method1();
        System.out.println("Inter1 default method4");
    }

    void method5();
}
