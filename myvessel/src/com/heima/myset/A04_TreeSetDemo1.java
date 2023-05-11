package com.heima.myset;

import java.util.TreeSet;

/**
 * @ClassName A04_TreeSetDemo1
 * @Description com.heima.myset.A04_TreeSetDemo1
 * @Author AsuraTu
 * @Date 2023/5/11 14:42
 * @Version 1.0.0
 */
public class A04_TreeSetDemo1 {
    public static void main(String[] args) {
        // TreeSet 底层是红黑树
        // 不是哈希表, 所以不用重写 hashCode 和 equals 方法
        // 但是要实现 Comparable 接口, 重写 compareTo 方法
        
        // 需求: 利用TreeSet集合，对整数进行排序

        // 1. 创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();
        // 2. 添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(50);
        // 3. 遍历集合
        for (Integer i : ts) {
            System.out.println(i);
        }

        // TreeSet 是并发安全的吗？
        // TreeSet 是非并发安全的
        // 如果要保证线程安全，可以使用 Collections 工具类中的 synchronizedSortedSet 方法


        String s = "CVSK3YFOW6";
        System.out.println(s.length()); // 10

        // TreeSet 降序
        TreeSet<Integer> ts2 = new TreeSet<>((o1, o2) -> o2 - o1);
        ts2.add(10);
        ts2.add(40);
        ts2.add(30);

        System.out.println(ts2);
    }
}
