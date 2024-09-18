package com.heima.mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName A01_ListDemo2
 * @Description com.heima.mylist.A01_ListDemo2
 * @Author AsuraTu
 * @Date 2023/5/8 10:43
 * @Version 1.0.0
 */
public class A01_ListDemo2 {
    public static void main(String[] args) {
        // List集合的两个删除的方法
        // public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        // public boolean remove(Object o): 移除列表中指定的元素, 返回的是一个boolean值。只会删除第一个匹配的元素。

        // 注意:
        // 在开发中, 我们要删除集合中的元素, 一定要使用集合的remove方法, 不要使用集合的其他方法

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        // [1, 1, 2, 3]
        list.add(3);

        // remove(Object o) // 需要自动装箱
        // remove(int index) // 不需要自动装箱
        // 当方法出现重载的时候, 会优先调用与实参类型一致的方法
        // 这里会优先调用实参与形参类型一致的方法, 不需要自动装箱
//        list.remove(1);

        // [1, 3]
        System.out.println(list);

        // 手动装箱
        Integer i = 1;
//        list.remove(i);
        // 也可以使用removeIf方法删除元素
        list.removeIf(x -> x == 1);
        // [3]
        System.out.println(list);


    }
}
