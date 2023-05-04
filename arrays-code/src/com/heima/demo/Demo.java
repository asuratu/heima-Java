package com.heima.demo;

import java.util.Arrays;

/**
 * @ClassName Demo
 * @Description com.heima.demo.Demo
 * @Author AsuraTu
 * @Date 2023/4/27 15:16
 * @Version 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        // 1. 定义一个数组
        int[] arr = {1, 2, 3, 4, 5};

        // toString() 方法
        // 1. 作用: 把数组转换成字符串
        // 2. 格式: [元素1, 元素2, 元素3, ...]
        String s = Arrays.toString(arr);
        System.out.println(s);

        // binarySearch() 方法
        // 1. 作用: 二分查找
        // 2. 格式: binarySearch(数组, 要查找的元素)
        // 3. 返回值: 如果找到了, 返回元素的索引, 如果没有找到, 返回 -1
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);

        // copyOf() 方法
        // 1. 作用: 复制数组
        // 2. 格式: copyOf(原数组, 新数组的长度)
        // 3. 返回值: 返回一个新的数组
        int[] ints = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(ints));

        // copyOfRange() 方法
        // 1. 作用: 复制数组的一部分
        // 2. 格式: copyOfRange(原数组, 起始索引, 结束索引)
        // 3. 返回值: 返回一个新的数组
        int[] ints1 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(ints1));

        // equals() 方法
        // 1. 作用: 比较两个数组是否相等
        // 2. 格式: equals(数组1, 数组2)
        // 3. 返回值: 如果相等, 返回 true, 如果不相等, 返回 false
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);

        // fill() 方法
        // 1. 作用: 填充数组, 把数组中的元素全部替换成指定的元素
        // 2. 格式: fill(数组, 填充的元素)
        // 3. 返回值: 无
        int[] arr3 = {1, 2, 3, 4, 5};
        Arrays.fill(arr3, 10);
        System.out.println(Arrays.toString(arr3));

        // sort() 方法
        // 1. 作用: 对数组进行升序排序, 底层使用的是快速排序
        // 2. 格式: sort(数组)
        // 3. 返回值: 无
        int[] arr4 = {5, 2, 3, 1, 4};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        // 降序
        Integer[] arr5 = {10, 2, 3, 1, 4, 5};
        Arrays.sort(arr5, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr5));

    }
}
