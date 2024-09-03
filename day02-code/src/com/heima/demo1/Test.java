package com.heima.demo1;

/**
 * @ClassName Test
 * @Description com.heima.demo1.Test
 * @Author AsuraTu
 * @Date 2023/5/16 13:14
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 逢 7 过
        // 1. 循环 1-100
        for (int i = 1; i <= 100; i++) {
            // 2. 判断当前数字是否包含 7
            // 2.1 将数字转换成字符串
            String s = String.valueOf(i);
            // 2.2 判断字符串中是否包含 7
            if (s.contains("7")) {
                // 3. 如果包含 7，那么就过
                System.out.println("过");
            } else {
                // 4. 如果不包含 7，那么就打印数字
                System.out.println(i);
            }
        }
    }
}
