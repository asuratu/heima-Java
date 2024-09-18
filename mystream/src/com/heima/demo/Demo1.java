package com.heima.demo;

import java.util.ArrayList;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");

        // 筛选出以A开头的名字
        names.stream().
                filter(name -> name.startsWith("A")).
                filter(name -> name.length() > 3).
                forEach(System.out::println);


    }
}
