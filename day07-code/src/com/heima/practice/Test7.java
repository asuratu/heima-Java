package com.heima.practice;

public class Test7 {
    public static void main(String[] args) {
        // 把整数当中的每一位都添加到数组中

        // 1. 输入一个整数
        System.out.println("请输入一个整数:");
        int num = new java.util.Scanner(System.in).nextInt();

        // 2. 计算整数的位数
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        System.out.println("count = " + count);

        // 3. 创建一个数组, 用来存储每一位
        int[] arr = new int[count];

        // 4. 将每一位存储到数组中
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        // 5. 输出数组
        for (int n : arr) {
            System.out.println(n);
        }
    }


}
