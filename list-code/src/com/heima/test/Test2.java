package com.heima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 需求：定义一个集合，添加数字，并进行遍历。
        // 遍历格式参照：[元素1，元素2，元素31.

        // 集合不能直接存储基本数据类型，所以要使用基本数据类型的包装类
        // byte    Byte
        // short   Short
        // int     Integer // 重点
        // long    Long
        // float   Float
        // double  Double
        // char    Character // 重点
        // boolean Boolean


        // 1. 定义一个集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 2. 遍历集合
        printList(list);
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
