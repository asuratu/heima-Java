package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName Test1
 * @Description Test1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三, 23", "李四, 24", "王五, 25");
        System.out.println(list);

        System.out.println("--------------------------");

        Map<String, Integer> m = list.stream().filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24).collect(Collectors.toMap(
                s -> s.split(", ")[0],
                s -> Integer.parseInt(s.split(", ")[1])
        ));
        System.out.println(m);
    }
}
