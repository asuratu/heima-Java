package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Test1
 * @Description Test1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Test4 {
    public static void main(String[] args) {
        // 创建一个List, 倒序排列
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        // 1. 匿名内部类
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        // 2. lambda表达式
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

        // 3. 方法引用
        //  方法引用是指，已有的方法实现，直接作为参数传入到Collections.sort()方法中
        // 相当于直接调用了Integer.compareTo()方法
        // 1. 引用处需要是函数式接口
        // 2. 被引用的方法需要已经存在
        // 3. 被引用的方法形参和返回值需要和抽象方法的形参和返回值一致
        // 4. 被引用的方法功能需要能满足当前的要求
        Collections.sort(list, Integer::compareTo);

        // 4. Stream API
        list.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
