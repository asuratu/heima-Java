package com.heima.practice;

public class Test31 {
    public static void main(String[] args) {
        // 需求：
        // 定义方法实现随机产生一个5位的验证码
        // 验证码格式：
        // 长度为5
        // 前四位是大写字母或者小写字母
        // 最后一位是数字

        System.out.println("checkCode = " + getCheckCode());
    }

    // 定义方法实现随机产生一个5位的验证码
    public static String getCheckCode() {
        boolean[] position = getPosition();

        StringBuilder checkCode = new StringBuilder();
        for (boolean b : position) {
            if (b) {
                // 5. 随机产生一个数字
                int num = (int) (Math.random() * 10);
                // 6. 将数字拼接到字符串中
                checkCode.append(num);
            } else {
                // 3. 随机产生一个字符
                char c = getRandomChar();
                // 4. 将字符拼接到字符串中
                checkCode.append(c);
            }
        }

        // 6. 返回结果
        return checkCode.toString();
    }

    public static boolean[] getPosition() {
        // 1. 定义一个数组, 用来保存结果
        boolean[] result = new boolean[5];
        // 2. 随机产生一个布尔值
        int numIndex = (int) (Math.random() * 5);
        // 3. 将布尔值放入数组中, 代表这个位置的字符是数字
        result[numIndex] = true;
        // 4. 返回结果
        return result;
    }

    // 定义方法, 用来随机产生一个字符
    public static char getRandomChar() {
        // 1. 随机产生一个10-61之间的整数
        int index = (int) (Math.random() * 52 + 10);
        // 2. 判断index的值
        if (index < 36) {
            // 4. 如果index的值小于36, 就返回A-Z之间的字符
            return (char) (index + 55);
        } else {
            // 5. 如果index的值大于等于36, 就返回a-z之间的字符
            return (char) (index + 61);
        }
    }
}


