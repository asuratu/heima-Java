package com.heima.arrayDemo;

public class ArrayTest8 {
    public static void main(String[] args) {
        // 两个数组指向同一块内存空间，修改其中一个数组的值，另一个数组也会受到影响

        int[] arr1 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        int[] arr2 = arr1;

        arr1[0] = 100;
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr2[0] = " + arr2[0]);
    }
}
