package com.heima.demo;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        try {
            // 数组越界异常
            int b = a[6];
            // 除数为0异常
            int c = 10 / 0;
            // 空指针异常
            String d = null;
            d.length();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            // 打印异常信息
//            System.out.println(e.getMessage());
            // 打印异常类型
//            System.out.println(e.toString());
            // 打印堆栈信息
            e.printStackTrace();
        }
    }
}
