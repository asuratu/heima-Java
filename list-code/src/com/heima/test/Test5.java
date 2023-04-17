package com.heima.test;

import java.util.ArrayList;

/**
 * @ClassName Test5
 * @Description com.heima.test.Test5
 * @Author AsuraTu
 * @Date 2023/4/17 13:04
 * @Version 1.0.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 添加用户对象并判断是否存在
        // 需求：
        // main方法中定义一个集合，存入三个用户对象。
        // 用户属性为：id, username, password
        // 要求：定义一个方法，根据id查找对应的用户信息。
        // 如果存在，返回true
        // 如果不存在，返回false

        // 1. 定义一个集合
        ArrayList<User> list = new ArrayList<>();

        // 2. 添加用户对象
        list.add(new User("1", "张三", "123"));
        list.add(new User("2", "李四", "123"));
        list.add(new User("3", "王五", "123"));

        // 3. 调用方法
        boolean flag1 = isExist(list, "1");
        boolean flag2 = isExist(list, "2");
        boolean flag3 = isExist(list, "3");
        boolean flag4 = isExist(list, "4");

        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println("flag3 = " + flag3);
        System.out.println("flag4 = " + flag4);
    }

    private static boolean isExist(ArrayList<User> list, String number) {
        for (User u : list) {
            if (u.getId().equals(number)) {
                return true;
            }
        }
        return false;
    }
}
