package com.heima.demo4;

/**
 * @ClassName Outer
 * @Description com.heima.demo4.Outer
 * @Author AsuraTu
 * @Date 2023/4/21 17:35
 * @Version 1.0.0
 */
public class Outer {
    private static final int A = 10;
    private final int aa = 100;

    static class Inner {
        public static void show1() {
            System.out.println("静态内部类的静态方法 show1");
            System.out.println(A);
        }

        public void show2() {
            System.out.println("静态内部类的非静态方法 show2");
            System.out.println(A);
            Outer o = new Outer();
            System.out.println(o.aa);
        }
    }
}
