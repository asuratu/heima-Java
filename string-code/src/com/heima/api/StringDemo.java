package com.heima.api;

/**
 * @author asura
 */
public class StringDemo {
    public static void main(String[] args) {
        // 字符串一旦创建，其值就不能改变，如果需要修改，只能重新创建新的字符串对象

        // String类的使用
        // 1. 直接赋值
        String s1 = "abc";
        System.out.println(s1);
        // 2. 构造方法
        String s2 = "abc";
        System.out.println(s2);
        // 3. 字符数组
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        String s6 = new String(chs);
        // 修改字符数组的值，不会影响字符串的值
        chs[0] = 'd';
        System.out.println(s3);
        System.out.println(s6);
        // 4. byte数组
        byte[] bys = {97, 98, 99};
        String s4 = new String(bys);
        System.out.println(s4);
    }
}
