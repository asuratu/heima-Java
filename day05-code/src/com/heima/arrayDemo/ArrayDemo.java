package com.heima.arrayDemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 数组的概述
        // 数组的概念: 数组是一种容器, 可以同时存放多个数据值

        // 数组的特点:
        // 1. 数组是一种引用数据类型
        // 2. 数组当中的多个数据, 类型必须统一
        // 3. 数组的长度在程序运行期间不可改变

        // 数组的初始化:
        // 1. 静态初始化(指定内容)
        // 1.1 完整格式: 数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...};
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        // 1.2 简化格式: 数据类型[] 数组名称 = {元素1, 元素2, ...};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr2));

        // 2. 动态初始化(指定长度)
        // 2.1 完整格式: 数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arr3 = new int[3];
        arr3[0] = 1;
        System.out.println(Arrays.toString(arr3));
        // 2.2 简化格式: 数据类型[] 数组名称 = new 数据类型[数组长度];
        int[] arr4 = new int[3];
        arr4[0] = 1;
        System.out.println(Arrays.toString(arr4));

        System.out.println(arr4); // [I@7b23ec81 是数组的内存地址, 不同数组的内存地址不同

        // 扩展:
        // 解释一下地址值的格式含义: [I@7b23ec81
        // 1. [I 表示这是一个 int 类型的数组。在Java中，[I的含义是“一个整数类型的数组”
        // 1.1 [ 表示这是一个数组类型。
        // 1.2 I 表示数组中元素的类型。
        //  •	Z 表示 boolean
        //	•	B 表示 byte
        //	•	C 表示 char
        //	•	D 表示 double
        //	•	F 表示 float
        //	•	J 表示 long
        //	•	S 表示 short
        //	•	L<className>; 表示一个类类型的对象。

        // 2. @7b23ec81 是对象的哈希码（hash code），这是由 Object 类的 hashCode() 方法生成的。这个哈希码通常是基于对象的内存地址计算的一个整数，并被转换成十六进制表示。
    }
}
