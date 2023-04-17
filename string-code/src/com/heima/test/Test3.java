package com.heima.test;

public class Test3 {
    public static void main(String[] args) {
        // 随机打乱字符串
        String s = "1234567890";
        String s1 = randomString(s);
        System.out.println(s1);
    }

    private static String randomString(String s) {
        // 1. 转成数组
        char[] chs = s.toCharArray();
        // 2. 随机打乱数组, 交换
        for (int i = 0; i < chs.length; i++) {
            int index = (int) (Math.random() * chs.length);
            char temp = chs[i];
            chs[i] = chs[index];
            chs[index] = temp;
        }
        // 3. 转成字符串
        return new String(chs);
    }

}
