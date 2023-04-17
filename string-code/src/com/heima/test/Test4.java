package com.heima.test;

public class Test4 {
    public static void main(String[] args) {
        // 数字字符串转换成整数
        // 定义一个字符串，内容是数字，例如"123"，把这个字符串转换成整数123
        // 1. 定义一个字符串
        String s = "123";

        // 2. 定义一个变量, 用来保存结果
        int num = 0;

        // 3. 遍历字符串, 获取每一个字符
        for (int i = 0; i < s.length(); i++) {
            // 4. 获取每一个字符
            char ch = s.charAt(i);

            // 5. 判断字符是否在 0-9 之间
            if (ch < '0' || ch > '9') {
                System.out.println("字符串中包含非数字字符");
                return;
            }

            // 6. 将字符转成数字
            int n = ch - '0';

            // 7. 计算结果
            num = num * 10 + n;
        }

        // 8. 输出结果
        System.out.println(num);
    }
}
