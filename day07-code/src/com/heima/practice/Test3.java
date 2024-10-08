package com.heima.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
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
        // 1. 定义一个字符串, 用来保存验证码
        StringBuilder checkCode = new StringBuilder();
        // 2. 随机产生5个字符
        for (int i = 0; i < 4; i++) {
            // 3. 随机产生一个字符
            char c = getRandomChar();
            // 4. 将字符拼接到字符串中
            checkCode.append(c);
        }
        // 5. 随机产生一个数字
        int num = (int) (Math.random() * 10);

        checkCode.append(num);

        // 6. 返回结果
        return shuffleString(checkCode.toString());
    }

    public static String shuffleString(String input) {
        // 将字符串转换为字符列表
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        // 打乱字符列表
        Collections.shuffle(characters);

        // 将打乱后的字符列表转换回字符串
        StringBuilder result = new StringBuilder(characters.size());
        for (char c : characters) {
            result.append(c);
        }

        return result.toString();
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


