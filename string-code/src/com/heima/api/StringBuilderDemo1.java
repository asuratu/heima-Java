package com.heima.api;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 判断是否是对称字符串
        String s = "abcba1";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println(s.equals(s2) ? "是对称字符串" : "不是对称字符串");
    }
}
