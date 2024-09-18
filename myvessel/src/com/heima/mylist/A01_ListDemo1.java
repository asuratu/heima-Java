package com.heima.mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName A01_ListDemo1
 * @Description com.heima.mylist.A01_ListDemo1
 * @Author AsuraTu
 * @Date 2023/5/8 10:36
 * @Version 1.0.0
 */
public class A01_ListDemo1 {
    public static void main(String[] args) {
        // list集合的特有方法:
        // public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        // public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        // public E set(int index, E element):用指定元素替换集合中指定位置的元素, 返回值的更新前的元素。
        // public E get(int index):返回集合中指定位置的元素。

        // 注意:
        // 操作索引的时候, 一定要防止索引越界异常

        // 1. 创建集合对象
        List<String> list = new ArrayList<>();

        // 2. 添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        // 会将指定索引及其以后的元素向后移动一位
        list.add(2, "赵六");
        System.out.println(list);

        System.out.println("-----------");

        // 3. 删除元素
        // 删除指定索引的元素, 返回的是被删除的元素
        list.remove(1);
        System.out.println(list);
        System.out.println("-----------");

        // 4. 修改元素
        // 修改指定索引的元素, 返回值的更新前的元素
        String before = list.set(1, "田七");
        System.out.println("before = " + before);
        System.out.println("-----------");

        // 5. 获取元素
        // 获取指定索引的元素
        String s = list.get(1);
        System.out.println("s = " + s);
        System.out.println("-----------");

        System.out.println(list);
    }
}
