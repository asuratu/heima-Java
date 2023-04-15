package com.heima.api;

public class StringDemo8 {
    public static void main(String[] args) {
        // 数字金额转换为大写金额
        int money = 456;
        String s = toChinese(money);
        System.out.println(s);
    }

    private static String toChinese(int money) {
        // 1. 定义一个字符串，用于存储大写金额
        StringBuilder result = new StringBuilder();
        // 2. 定义一个字符串数组，用于存储单位
        String[] units = {"", "十", "百", "千", "万", "十", "百", "千", "亿"};
        // 3. 定义一个字符串数组，用于存储数字, 大写汉字
        String[] nums = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        // 4. 把数字转成字符串
        StringBuilder s = new StringBuilder(String.valueOf(money));
        // 4.1 不足9位，前面补0
        while (s.length() < 9) {
            s.insert(0, "0");
        }
        // 5. 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 6. 获取每一个字符
            char c = s.charAt(i);
            // 7. 把字符转成数字
            int num = c - '0';
            // 8. 判断是否是最后一位
            if (i != s.length() - 1) {
                // 9. 不是最后一位，拼接单位
                result.append(nums[num]).append(units[s.length() - 1 - i]);
            } else {
                // 10. 是最后一位，不拼接单位
                result.append(nums[num]);
            }
        }
        return result.toString();
    }

}
