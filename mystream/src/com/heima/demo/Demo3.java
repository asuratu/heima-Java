package com.heima.demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Demo3 {
    public static void main(String[] args) {
        // 收集方法 collect()
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-18-男", "李四-20-女", "王五-25-男");

        // 1.toList()
        // 结果不会去重
        List<String> l1 = list.stream().filter(s -> s.split("-")[0].startsWith("张")).collect(Collectors.toList());
        List<String> l2 = list.stream().filter(s -> s.split("-")[0].startsWith("张")).toList();
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("================");

        // 2.toSet()
        // 结果会去重
        Set<String> l3 = list.stream().filter(s -> s.split("-")[0].startsWith("张")).collect(Collectors.toSet());
        System.out.println(l3);

        System.out.println("================");

        // 3. toMap()
        // 注意: 作为key的元素不能重复, 否则会抛出异常
        Map<String, String> m = list.stream().filter(s -> s.split("-")[0].startsWith("张")).collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> s.split("-")[1]
        ));
        System.out.println(m);
    }
}
