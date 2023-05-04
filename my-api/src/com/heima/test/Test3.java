package com.heima.test;

/**
 * @ClassName Test3
 * @Description com.heima.test.Test3
 * @Author AsuraTu
 * @Date 2023/4/27 09:42
 * @Version 1.0.0
 */
public class Test3 {
    public static void main(String[] args) {
        // 自己定义一个方法实现 toBinaryString(int i), 将整数转换为二进制的字符串

        // 1. 定义一个整数
        int i = 6;

        // 2. 定义一个字符串, 用来存储最终的结果
        StringBuilder result = new StringBuilder();

        // 3. 遍历
        while (i > 0) {
            // 4. 计算
            result.insert(0, i % 2);

            // 5. 改变 i 的值
            i /= 2;
        }

        // 6. 输出结果
        System.out.println(result);
    }
}
