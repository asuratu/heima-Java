package com.heima.sort;

/**
 * @ClassName Recursive
 * @Description com.heima.sort.Recursive
 * @Author AsuraTu
 * @Date 2023/4/27 14:30
 * @Version 1.0.0
 */
public class RecursiveDemo2 {
    public static void main(String[] args) {
        // 利用递归求阶乘
        int factorial = getFactorial(6);
        System.out.println(factorial);
    }

    private static int getFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * getFactorial(i - 1);
    }

}
