package com.heima.api;

public class StringDemo11 {
    public static void main(String[] args) {
        // 定义一个敏感词库
        String[] words = {"草", "傻逼", "操你妈"};
        // 敏感词替换
        String s = "你好, 草, 你是傻逼吗?";
        for (String word : words) {
            if (s.contains(word)) {
                int len = word.length();
                StringBuilder star = new StringBuilder();
                star.append("*".repeat(len));
                s = s.replace(word, star);
            }
        }
        System.out.println(s);
    }
}
