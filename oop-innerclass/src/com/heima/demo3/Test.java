package com.heima.demo3;

/**
 * @ClassName Test
 * @Description com.heima.demo3.Test
 * @Author AsuraTu
 * @Date 2023/4/21 17:19
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
