package com.heima.sort;

/**
 * @ClassName Recursive
 * @Description com.heima.sort.Recursive
 * @Author AsuraTu
 * @Date 2023/4/27 14:30
 * @Version 1.0.0
 */
public class Recursive {
    public static void main(String[] args) {
        // 利用递归计算 1-100 的和
        int sum = getSum(100);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + getSum(i - 1);
    }
}
