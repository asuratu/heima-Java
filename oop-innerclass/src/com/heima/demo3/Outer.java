package com.heima.demo3;

/**
 * @ClassName Outer
 * @Description com.heima.demo3.Outer
 * @Author AsuraTu
 * @Date 2023/4/21 17:15
 * @Version 1.0.0
 */
class Outer {
    private final int a = 10;
    private final int aa = 100;

    class Inner {
        private final int a = 20;

        public void show() {
            int a = 30;
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a); // 20
            System.out.println(a); // 30
            System.out.println(aa); // 100
        }
    }
}
