package com.heima.api;

public class StringDemo5 {
    public static void main(String[] args) {
        // 字符串反转
        String s = "abcde";
        // 1. 转成数组
        char[] chs = s.toCharArray();
        // 2. 反转数组
        reverse(chs);
        // 3. 转成字符串
        String result = new String(chs);
        System.out.println(result);
    }

    private static void reverse(char[] chs) {
        for (int start = 0, end = chs.length - 1; start < end; start++, end--) {
            // 交换
            char temp = chs[start];
            chs[start] = chs[end];
            chs[end] = temp;
        }
    }
}
