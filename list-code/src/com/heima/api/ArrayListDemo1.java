package com.heima.api;

import java.util.ArrayList;

/**
 * @author asura
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1. 创建集合的容器
        // 泛型: 限制集合中的元素类型
        // JDK7: ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // ArrayList 是 Java 已经提供好的一个类, 里面已经封装好了很多方法
        // 这个类在底层做了一些处理
        // 打印对象不是地址值, 而是对象中的元素 []

        // 2. 添加元素
        // 会返回一个 boolean 值, 表示是否添加成功
        list.add("hello");
        list.add("hello");
        list.add("world");
        System.out.println(list);

        // 3. 获取元素
        // 会返回被获取的元素
//        String s = list.get(0);
        String s = list.getFirst();
        System.out.println(s);

        // 4. 获取集合的长度
        // 会返回集合的长度
        int size = list.size();
        System.out.println(size);

        // 5. 遍历集合
        for (String s1 : list) {
            System.out.println(s1);
        }

        // 6. 删除元素
        System.out.println("删除元素1");
        // 会返回被删除的元素
//        String r = list.remove(0);
        System.out.println(list);

//        Boolean b = list.remove("hello");
        // 删除全部的值为 hello 的元素
//        list.removeIf("hello"::equals);
        list.removeFirst();
        System.out.println(list);
        System.out.println("删除元素2");

        // 7. 修改元素
        // 会返回被修改的元素
        list.set(0, "java");
        System.out.println(list);

        // 8. 清空集合
        list.clear(); // 返回 void
        System.out.println(list);

        // 9. 判断集合是否为空
        // 会返回一个 boolean 值, 表示集合是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);

        // 10. 判断集合中是否包含某个元素
        boolean contains = list.contains("hello");
        System.out.println(contains);

        // 11. 获取元素的索引
        list.add("hello");
        int index = list.indexOf("hello");
        System.out.println(index);

        // 12. 判断集合是否相等: 集合中的元素是否相同, 顺序是否相同
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        System.out.println(list.equals(list2));

        // 13. 将集合转成数组
        String[] arr = list.toArray(new String[0]);
        for (String s1 : arr) {
            System.out.println(s1);
        }


    }
}
