package com.heima.math;

/**
 * @ClassName Test
 * @Description com.heima.math.Test
 * @Author AsuraTu
 * @Date 2023/4/24 16:39
 * @Version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 判断一个数是不是自幂数
        // 自幂数：一个n位自然数数的每一位的n次方的和等于这个数本身
        // 例如：153 = 1^3 + 5^3 + 3^3

        // 1. 定义一个变量
//        while (true) {
//            // 请输入一个数
//            System.out.println("请输入一个数：");
//            int num = new Scanner(System.in).nextInt();
//            handle(num);
//        }

        // 打印当前时间 标准时间格式
        // 2020-04-24 16:39:00
        long current = System.currentTimeMillis();
        

        // 1 - 100
        for (int i = 1; i <= 1000; i++) {
            handle(i);
        }
    }

    private static void handle(int num) {
        // 2. 定义一个变量，用来记录是否为自幂数
        boolean flag = true;
        // 3. 获取这个数的位数
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        // 4. 循环判断
        temp = num;
        int sum = 0;
        while (temp != 0) {
            int n = temp % 10;
            sum += Math.pow(n, count);
            temp /= 10;
        }
        if (sum != num) {
            flag = false;
        }
        // 5. 输出结果
        if (flag) {
            System.out.println(num + "是自幂数");
        }
    }
}
