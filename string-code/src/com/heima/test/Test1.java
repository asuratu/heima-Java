package com.heima.test;

public class Test1 {
    public static void main(String[] args) {
        // 阿拉伯数字转换为罗马数字
        String s = "123321";
        // 1. 定义一个方法, 用来将阿拉伯数字转换为罗马数字
        String s2 = toRoman(s);
        System.out.println(s2);
    }

    private static String toRoman(String s) {
        // 1. 定义一个字符串, 用来存储罗马数字
        StringBuilder sb = new StringBuilder();
        // 定义一个数组
        String[] roman = {"-", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        // 2. 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 3. 获取每一个字符
            char c = s.charAt(i);
            // 4. 将字符转换为数字
            int num = c - '0';
            // 5. 根据数字, 获取对应的罗马数字
            String r = roman[num];
            // 6. 将罗马数字拼接到字符串中
            sb.append(r).append(" ");
        }
        return sb.toString();
    }
}
