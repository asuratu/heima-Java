package com.heima.demo6;


/**
 * @ClassName Test
 * @Description com.heima.demo6.Test
 * @Author AsuraTu
 * @Date 2023/4/21 14:51
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        // 接口中的抽象方法必须被重写, 通过实现类调用
        d.method5();

        // 接口中的静态方法只能通过接口名调用
        Inter1.method3();

        // 接口中的默认方法可以通过实现类的对象调用
        d.method4();
    }
}
