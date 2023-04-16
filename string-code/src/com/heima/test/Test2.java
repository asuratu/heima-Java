package com.heima.test;

public class Test2 {
    public static void main(String[] args) {
        // 调整字符串
        // 给定两个字符串，A和 B。
        // A 的旋转操作就是将 A 最左边的字符移动到最右边。
        // 例如，若A='abcde’，在移动一次之后结果就是 bcdea’。
        // 如果在若干次调整操作之后，A能变成B，那么返回True。
        // 如果不能匹配成功，则返回false

        // 1. 定义两个字符串
        String A = "abcde";
        String B = "cdeab";

        // 2. 判断两个字符串的长度是否相等
        if (A.length() != B.length()) {
            System.out.println("false");
            return;
        }

        // 3. 将 A 进行旋转, 每次旋转一次, 判断是否和 B 相等
        for (int i = 0; i < A.length(); i++) {
            A = A.substring(1) + A.charAt(0);
            if (A.equals(B)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
