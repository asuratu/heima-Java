package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Demo2 {
    public static void main(String[] args) {
        // 获取 Stream 流
        // 1. 单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "orange", "pear");
        list.stream().filter(name -> name.length() > 4).forEach(System.out::println);

        System.out.println("============");

        // 2. 双列集合
        // 先转成 单列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        // 无法直接使用
        //  map.stream().filter(entry -> entry.getValue() > 20).forEach(System.out::println);
        // 转成 entrySet 再使用
        map.entrySet().stream().filter(entry -> entry.getValue() > 20).forEach(System.out::println);

        System.out.println("============");

        // 3. 数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).filter(num -> num > 3).forEach(System.out::println);
        // 等价于
        Stream.of(arr).filter(num -> num > 3).forEach(System.out::println);

        System.out.println("============");

        // 4. 零散的元素, 元素类型统一
        Stream.of("apple", "banana", "orange", "pear").filter(name -> name.length() > 4).forEach(System.out::println);

    }
}
