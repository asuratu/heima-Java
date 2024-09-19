package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Demo3
 * @Description Demo3
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo3 {
    public static void main(String[] args) {
        // 方法引用 (引用成员方法)
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");

        // 转换为 大写
        List<String> upperList = list.stream().map(String::toUpperCase).toList();
        System.out.println(upperList);
    }
}
