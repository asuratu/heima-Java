package com.heima.practice;

public class Test2 {
    public static void main(String[] args) {
        // 1、判断101-200之间有多少个素数，并输出所有素数。
        int count = 0;
        int start = 1;
        int end = 100;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count = " + count);
    }

    // 定义一个方法, 用来判断一个数是否是素数
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        // 1. 定义一个变量, 用来记录是否是素数
        boolean flag = true;
        // 2. 遍历2到num的平方根之间的所有数
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // 3. 判断num是否能被i整除
            if (num % i == 0) {
                // 4. 如果能被整除, 就将flag赋值为false
                flag = false;
                // 5. 跳出循环
                break;
            }
        }
        // 6. 返回结果
        return flag;
    }
}
