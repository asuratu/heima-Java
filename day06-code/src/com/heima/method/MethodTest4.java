package com.heima.method;

import java.util.Arrays;

public class MethodTest4 {
    public static void main(String[] args) {
        // 需求：定义一个方法copyOfRange(int[] arr, int from, int to)
        // 功能：
        // 将数组arr中从索引from（包含from）开始。
        // 到索引to结束（不包含to）的元素复制到新数组中，
        // 将新数组返回。

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = copyOfRange(arr, 2, 15);
        System.out.println("newArr = " + Arrays.toString(newArr));
    }

    // 定义一个方法, 用来复制数组中的元素
    public static int[] copyOfRange(int[] arr, int from, int to) {
        if (from < 0 || to > arr.length || from > to) {
            System.out.println("参数错误");
            return null;
        }
        // 1. 创建一个新数组
        int[] newArr = new int[to - from];
        // 2. 将元素赋值给新数组
        System.arraycopy(arr, from, newArr, 0, to - from);
        // Q: 解释下上面代码的参数
        // A: arr: 源数组
        //    from: 源数组的起始位置
        //    newArr: 目标数组
        //    0: 目标数组的起始位置
        //    to - from: 要复制的元素个数

        // 3. 返回结果
        return newArr;
    }
}
