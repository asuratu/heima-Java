package com.heima.demo;

/**
 * @ClassName Administrator
 * @Description com.heima.demo.Administrator
 * @Author AsuraTu
 * @Date 2023/4/18 17:12
 * @Version 1.0.0
 */
public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("我是管理员, 我叫" + getName() + ", 我今年" + getAge() + "岁");
    }
}
