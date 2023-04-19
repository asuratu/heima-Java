package com.heima.demo;

/**
 * @ClassName FinalDemo
 * @Description com.heima.demo.FinalDemo
 * @Author AsuraTu
 * @Date 2023/4/19 13:20
 * @Version 1.0.0
 */
public class FinalDemo2 {
    public static void main(String[] args) {
        // final 修饰的基本数据类型, 记录的值不能改变
        // final 修饰的引用数据类型, 记录的地址值不能改变, 但是地址值指向的内容可以改变

        final double PI = 3.14;
        // PI = 3.1415926; // 错误, 不能改变
        System.out.println(PI);

        final int[] arr = {1, 2, 3};
        // arr = {4, 5, 6}; // 错误, 不能改变
        arr[0] = 4; // 正确, 可以改变
        System.out.println(arr[0]);
    }
}
