package com.heima.api;

/**
 * @author asura
 */
public class StringDemo6 {
    public static void main(String[] args) {
        // 统计字符串中, 小写字母, 大写字母, 数字的个数
        String s = "Hello1311World";

        // 定义三个变量, 分别统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        // 遍历字符串, 获取到每一个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 判断字符属于哪个类型
            // char 类型的数据在比较或计算时, 会自动转换为对应的 ASCII 码的int类型, 进行比较
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        System.out.println("大写字母个数: " + bigCount);
        System.out.println("小写字母个数: " + smallCount);
        System.out.println("数字个数: " + numberCount);

    }
}
