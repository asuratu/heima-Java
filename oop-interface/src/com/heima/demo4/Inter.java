package com.heima.demo4;

/**
 * @author asura
 */
public interface Inter {
    // 接口中默认方法的定义格式
    default void show() {
        System.out.println("Inter1 show");
    }

    void method();

}
