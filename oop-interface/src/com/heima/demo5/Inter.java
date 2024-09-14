package com.heima.demo5;

/**
 * @author asura
 */
public interface Inter {
    // 接口中的静态方法
    static void show() {
        System.out.println("Inter static show");
    }

    // 静态方法可以使用私有静态方法
    static void staticMethod() {
        System.out.println("Static method");
        staticHelper();  // 调用私有静态方法
    }

    // 定义一个静态私有方法
    private static void staticHelper() {
        System.out.println("Private static method to assist static method");
    }

    void method();

    // 默认方法可以使用私有方法
    default void defaultMethod() {
        System.out.println("Default method");
        commonHelper();  // 调用私有方法
    }

    // 定义一个普通私有方法
    private void commonHelper() {
        System.out.println("Private method to assist default method");
    }
}
