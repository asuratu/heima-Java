package com.heima.demo4;

/**
 * @ClassName Demo
 * @Description com.heima.demo4.Demo
 * @Author AsuraTu
 * @Date 2023/4/21 14:08
 * @Version 1.0.0
 */
public class Demo implements Inter, Inter1 {

    // Inter, Inter1 接口中都有 show() 方法, 所以必须重写
    @Override
    public void show() {
        Inter.super.show();
    }

    @Override
    public void method() {
        System.out.println("重写了方法");
    }

    // 如果不重写, 则对象调用show()方法时, 会调用接口中的默认方法
//    @Override
//    public void show() {
//        Inter.super.show();
//        System.out.println("重写了show方法");
//    }
}
