package com.heima.integer;

/**
 * @ClassName IntegerDemo
 * @Description com.heima.integer.IntegerDemo
 * @Author AsuraTu
 * @Date 2023/4/26 17:57
 * @Version 1.0.0
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 1. toBaseString(int i, int radix) 将整数转换为二进制的字符串
        System.out.println(Integer.toBinaryString(10)); // 1010

        // 2. toOctalString(int i) 将整数转换为八进制的字符串
        System.out.println(Integer.toOctalString(10)); // 12

        // 3. toHexString(int i) 将整数转换为十六进制的字符串
        System.out.println(Integer.toHexString(10)); // a

        // 4. parseInt(String s, int radix) 将指定进制的字符串转换为整数
        System.out.println(Integer.parseInt("1010", 2)); // 10

        // 5. parseInt(String s) 将十进制的字符串转换为整数
        System.out.println(Integer.parseInt("10a")); // 10
    }
}
