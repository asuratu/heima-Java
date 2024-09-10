package com.heima.test;

import java.util.ArrayList;

/**
 * @ClassName Test7
 * @Description com.heima.test.Test7
 * @Author AsuraTu
 * @Date 2023/4/17 13:15
 * @Version 1.0.0
 */
public class Test7 {
    public static void main(String[] args) {
        // 需求：
        // 定义Javabean类：Phone
        // Phone属性：品牌，价格。
        // main方法中定义一个集合，存入三个手机对象。
        // 分别为：小米，1000。苹果，8000。锤子2999。
        // 定义一个方法，将价格低于3000的手机信息返回。

        // 1. 定义一个集合
        ArrayList<Phone> list = new ArrayList<>();

        // 2. 添加手机对象
        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("锤子", 2999));

        // 3. 调用方法
        ArrayList<Phone> list1 = getPhone(list);

        for (Phone p : list1) {
            System.out.println(p);
        }
    }

    private static ArrayList<Phone> getPhone(ArrayList<Phone> list) {
        ArrayList<Phone> l = new ArrayList<>();
        for (Phone p : list) {
            if (p.getPrice() < 3000) {
                l.add(p);
            }
        }
        return l;
    }
}
