package com.heima.process;

public class ContinueAndBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 跳过本次循环, 继续下一次循环
            }
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                break; // 跳出循环
            }
            System.out.println(i);
        }
    }
}
