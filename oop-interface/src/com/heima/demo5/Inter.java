package com.heima.demo5;

/**
 * @author asura
 */
public interface Inter {
    // 接口中的静态方法
    static void show() {
        System.out.println("Inter static show");
    }

    void method();
}
