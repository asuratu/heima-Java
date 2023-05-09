package com.heima.mygenerics;

import java.util.ArrayList;

/**
 * @ClassName A03_GenericsDemo3
 * @Description com.heima.mygenerics.A03_GenericsDemo3
 * @Author AsuraTu
 * @Date 2023/5/9 15:04
 * @Version 1.0.0
 */
public class A03_GenericsDemo3 {
    // 定义一个工具类: ListUtils
    // 类中定义一个静态方法, 用来添加多个集合元素
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtils.addAll(list, "张三", "李四", "王五");

        System.out.println(list);
    }
}
