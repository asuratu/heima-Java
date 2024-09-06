package com.heima.method;

public class MethodTest {
    public static void main(String[] args) {
        // 方法的重载
        // 比较两个整数是否相等, 要求兼容 byte, short, int, long

        System.out.println(compare((byte) 20, (byte) 20));
        System.out.println(compare((short) 20, (short) 20));
        System.out.println(compare(20, 20));
        System.out.println(compare(20L, 20L));

        System.out.println("----------------------");

        System.out.println(compareG(20, (short) 20));
    }

    // 比较两个整数是否相等
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    // 泛型
    public static <T extends Number> boolean compareG(T a, T b) {
        System.out.println("T: " + a.getClass().getSimpleName());
        return a.longValue() == b.longValue();
    }


}
