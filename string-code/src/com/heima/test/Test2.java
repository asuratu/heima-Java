package com.heima.test;

public class Test2 {
    public static void main(String[] args) {
        // 调整字符串
        // 给定两个字符串，A和 b。
        // a 的旋转操作就是将 a 最左边的字符移动到最右边。
        // 例如，若A='abcde’，在移动一次之后结果就是 bcdea’。
        // 如果在若干次调整操作之后，A能变成B，那么返回True。
        // 如果不能匹配成功，则返回false

        // 1. 定义两个字符串
        String a = "abcde";
        String b = "cdeab";

        // 2. 判断两个字符串的长度是否相等
        if (a.length() != b.length()) {
            System.out.println("false");
            return;
        }

        // 3. 将 a 进行旋转, 每次旋转一次, 判断是否和 b 相等
        for (int i = 0; i < a.length(); i++) {
            a = a.substring(1) + a.charAt(0);
            if (a.equals(b)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
