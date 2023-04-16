package com.heima.api;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // 字符串拼接
        // 1. 使用 + 运算符
        // 2. 使用 StringBuilder
        // 3. 使用 StringJoiner
        // 4. 使用 Apache 的 StringUtils
        // 5. 使用 Guava 的 Joiner
        // 6. 使用 Spring 的 StringUtils

        int[] arr = {1, 2, 3, 4, 5};
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : arr) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
