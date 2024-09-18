package com.heima.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test1
 * @Description Test1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println("--------------------------");

        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(list1);
    }
}
