package com.heima.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName A01_ListDemo3
 * @Description com.heima.mylist.A01_ListDemo3
 * @Author AsuraTu
 * @Date 2023/5/8 13:10
 * @Version 1.0.0
 */
public class A01_ListDemo3 {
    public static void main(String[] args) {
        // List集合的遍历方式
        // 1. 迭代器遍历  ------------  在遍历的过程中, 如果要删除元素, 请使用迭代器
        // 2. 列表迭代器 ------------  在遍历的过程中, 如果要添加元素, 请使用列表迭代器
        // 3. 增强for循环 ------------  获取元素
        // 4. Lambda表达式 ------------  获取元素
        // 5. 普通for循环 ------------  获取元素和索引

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        // 1. 迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("s = " + s);
        }

        System.out.println("====================================");

        // 2. 列表迭代器
        // 细节: ListIterator是Iterator的子接口
        //      ListIterator可以实现在迭代过程中完成对元素的增删改查
        //      Iterator只能遍历, 不能增删改查
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if ("李四".equals(s)) {
                // 在迭代过程中添加元素
                lit.add("张三丰");
            }
            System.out.println("s = " + s);
        }

        System.out.println("====================================");

        // 3. 增强for循环
        for (String s : list) {
            System.out.println("s = " + s);
        }

        System.out.println("====================================");

        // 4. Lambda表达式
        list.forEach(s -> System.out.println("s = " + s));

        System.out.println("====================================");

        // 5. 普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println("s = " + s);
        }

    }
}
