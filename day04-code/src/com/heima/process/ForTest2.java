package com.heima.process;

public class ForTest2 {
    public static void main(String[] args) {
        // 打印 1 - 100 的偶数, 并且求和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
            sum += i;
        }
        System.out.println("和为: " + sum);
    }
}
