package com.heima.demo;

/**
 * @author asura
 */
public interface Swim {
    // 接口中成员的特点
    // 1. 成员变量：
    // 1.1 只能是常量
    // 1.2 默认修饰符: public static final
    int A = 10;
        
    // 2. 没有构造方法

    // 3.成员方法：
    // 3.1 只能是抽象方法
    // 3.2 默认修饰符: public abstract
    void swim();
}
