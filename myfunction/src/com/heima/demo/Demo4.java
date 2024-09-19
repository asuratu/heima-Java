package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Demo4
 * @Description Demo4
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo4 {
    public static void main(String[] args) {
        // 方法引用 (引用数组的构造方法)
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        // 转换为 字符串 数组
        List<String> strList = list.stream().map(String::valueOf).toList();
        System.out.println(strList);

        // 转换为 Integer 数组
        // 注意: 数组的类型需要和流中元素的类型一致
        Integer[] intArray = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
    }
}
