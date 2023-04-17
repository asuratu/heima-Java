package com.heima.test;

import java.util.ArrayList;

/**
 * @ClassName Test6
 * @Description com.heima.test.Test6
 * @Author AsuraTu
 * @Date 2023/4/17 13:04
 * @Version 1.0.0
 */
public class Test6 {
    public static void main(String[] args) {
        // 添加用户对象并判断是否存在
        // 需求：
        // main方法中定义一个集合，存入三个用户对象。
        // 用户属性为：id, username, password
        // 要求：定义一个方法，根据id查找对应的用户信息。
        // 如果存在，返回索引
        // 如果不存在，返回-1

        // 1. 定义一个集合
        ArrayList<User> list = new ArrayList<>();

        // 2. 添加用户对象
        list.add(new User("1", "张三", "123"));
        list.add(new User("2", "李四", "123"));
        list.add(new User("3", "王五", "123"));

        // 3. 调用方法
        int index1 = getIndex(list, "1");
        int index2 = getIndex(list, "2");
        int index3 = getIndex(list, "3");
        int index4 = getIndex(list, "4");

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        System.out.println("index3 = " + index3);
        System.out.println("index4 = " + index4);

    }

    private static int getIndex(ArrayList<User> list, String number) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId().equals(number)) {
                return i;
            }
        }
        return -1;
    }

}
