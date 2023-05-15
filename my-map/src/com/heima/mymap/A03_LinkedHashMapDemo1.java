package com.heima.mymap;

import java.util.LinkedHashMap;

/**
 * @ClassName A03_LinkedHashMapDemo1
 * @Description com.heima.mymap.A03_LinkedHashMapDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 14:45
 * @Version 1.0.0
 */
public class A03_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        // 有序, 不重复, 无索引
        // 有序: 保证存储和取出的顺序是一致的
        // 原理: 底层的数据结构是哈希表, 每个键值对的元素又多了一个双链表的机制记录存储的顺序

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("张三", 23);
        System.out.println(map); // {张三=23, 李四=24, 王五=25}


    }
}
