package com.heima.demo;

import java.util.Arrays;

/**
 * @ClassName Test1
 * @Description com.heima.demo.Test1
 * @Author AsuraTu
 * @Date 2023/4/27 17:01
 * @Version 1.0.0
 */
public class Test1 {
    public static void main(String[] args) {
        // 定义数组并存储一些字符串，利用Arrays中的sor方法进行排序
        // 要求:
        // 按照字符串的长度进行排序，短的在前面，长的在后面。
        // 暂时不比较字符串里面的内容

        String[] arr = {"aaa", "b", "cc", "dddd"};

        // 1. 使用匿名内部类的方式
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 按照字符串的长度进行排序，短的在前面，长的在后面。
//                return o1.length() - o2.length(); // 负数表示 o1 < o2, 升序
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        // 2. 使用 Lambda 表达式的方式, 降序
        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(arr));
    }
}
