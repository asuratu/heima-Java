package com.heima.api;

public class StringDemo {
    public static void main(String[] args) {
        // String类的使用
        // 1. 直接赋值
        String s1 = "abc";
        System.out.println(s1);
        // 2. 构造方法
//        String s2 = new String("abc");
        // 3. 字符数组
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3);
        // 4. byte数组
        byte[] bys = {97, 98, 99};
        String s4 = new String(bys);
        System.out.println(s4);
    }
}
