package com.heima.test;

public class StringTest {
    public static void main(String[] args) {
        // 1. 定义一个字符串
        String s = "hello";
        // 2. 转大写
        String s1 = s.toUpperCase();
        System.out.println(s1);
        // 3. 转小写
        String s2 = s.toLowerCase();
        System.out.println(s2);
        // 4. 获取字符串的长度
        int length = s.length();
        System.out.println(length);
        // 5. 获取指定索引位置的字符
        char c = s.charAt(1);
        System.out.println(c);
        // 6. 获取指定字符第一次出现的索引
        int index = s.indexOf('l');
        System.out.println(index);
        // 7. 获取指定字符最后一次出现的索引
        int lastIndex = s.lastIndexOf('l');
        System.out.println(lastIndex);
        // 8. 截取字符串
        String s3 = s.substring(1, 3);
        System.out.println(s3);
        // 9. 判断字符串是否以指定字符串开头
        boolean startsWith = s.startsWith("he");
        System.out.println(startsWith);
        // 10. 判断字符串是否以指定字符串结尾创
        boolean endsWith = s.endsWith("lo");
        System.out.println(endsWith);
        // 11. 替换字符串
        String s4 = s.replace('l', 'p');
        System.out.println(s4);

    }
}

