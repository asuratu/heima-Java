package com.heima.demo4;

public interface Inter1 {
    // 接口中默认方法的定义格式
    default void show() {
        System.out.println("Inter show");
    }
}
