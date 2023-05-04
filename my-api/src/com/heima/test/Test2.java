package com.heima.test;

/**
 * @ClassName Test2
 * @Description com.heima.test.Test2
 * @Author AsuraTu
 * @Date 2023/4/27 09:35
 * @Version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 自己实现 parseInt(String s), 将十进制的字符串转换为整数
        // 要求:
        // 1. 字符串中只能有数字, 不能有其他字符
        // 2. 字符串最少一位, 最大十位
        // 3. 字符串中 0 不能开头

        // 1. 定义一个字符串
        String s = "1234567890";

        // 2. 定义一个整数, 用来存储最终的结果
        int result = 0;

        // 正则
        String regex = "[1-9]\\d{0,9}";

        if (!s.matches(regex)) {
            System.out.println("字符串不符合要求");
            return;
        }

        // 3. 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 4. 获取每一个字符
            char c = s.charAt(i);

            // 6. 计算
            result = result * 10 + (c - '0');
        }

        // 7. 输出结果
        System.out.println(result);
    }
}
