package com.heima.arithmetic;

public class Demo2 {
    public static void main(String[] args) {
        // 不同类型的数据之间的运算规则
        int a = 10;
        double b = 20.1;
        // 判断 a+b 的结果的类型是什么? double

        // 在运算之前, 先要转换成同一类型

        // 类型转换
        // 1. 自动类型转换 (自动类型提升) (隐式转换)
        // 1.1 byte < short < int < long < float < double 取值范围小的类型可以自动转换为取值范围大的类型
        // 1.2 byte, short, char 三种类型在运算时, 会自动转换为 int 类型

        // 2. 强制类型转换, 大类型转换为小类型
        // 2.1 语法: (小类型) 大类型的变量
        // 2.2 注意: 强制类型转换可能会导致精度丢失
        // 2.3 强制类型转换可能会导致数据溢出
        long c = 100L;
        int d = (int) c;
        System.out.println(d);

        // 分隔符
        System.out.println("----------------------------");

        // + 用于字符串的拼接, 从左到右依次执行
        // 每一次只要有字符串参与, 那就是拼接
        System.out.println(1 + 99 + "hello" + 1 + 2); // 100hello12
        System.out.println("abc" + true + 1 + 2); // abctrue12
        System.out.println(true + "abc"); // trueabc
    }
}
