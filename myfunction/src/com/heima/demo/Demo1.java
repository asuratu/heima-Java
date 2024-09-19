package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 方法引用 (引用静态方法)
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3");

        // 转换为整形
        List<Integer> list1 = list.stream().map(Integer::parseInt).toList();
        System.out.println(list1);
    }
}
