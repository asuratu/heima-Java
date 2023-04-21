package com.heima.demo7;

/**
 * @ClassName Test
 * @Description com.heima.demo7.Test
 * @Author AsuraTu
 * @Date 2023/4/21 16:03
 * @Version 1.0.0
 */
public class Test extends InterAdapter {
    public static void main(String[] args) {
        Test t = new Test();
        t.method6();
    }

    @Override
    void method6() {
        System.out.println("Test 重写了 method6 方法");
    }
}
