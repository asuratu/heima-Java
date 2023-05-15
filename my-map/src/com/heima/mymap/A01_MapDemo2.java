package com.heima.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName A01_MapDemo1
 * @Description com.heima.mymap.A01_MapDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 10:54
 * @Version 1.0.0
 */
public class A01_MapDemo2 {
    public static void main(String[] args) {
        // Map 集合的遍历方式:
        // 1. 获取所有的 key, 所有的 key 是一个 Set 集合, 遍历 key 的集合, 获取到每一个 key, 根据 key 获取 value
        // 2. 获取所有的 value, 所有的 value 是一个 Collection 集合, 遍历 value 的集合, 获取到每一个 value
        // 3. 获取所有的键值对对象, 所有的键值对对象是一个 Set 集合, 遍历键值对对象的集合, 获取到每一个键值对对象, 根据键值对对象获取 key 和 value
        // 4. JDK 1.8 之后的新技术, 增强 for 循环
        // 5. JDK 1.8 之后的新技术, 使用 Lambda 表达式

        // 1. 创建集合对象
        Map<String, String> map = new HashMap<>();
        // 2. 添加元素
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");

        // 1. 获取所有的 key, 所有的 key 是一个 Set 集合, 遍历 key 的集合, 获取到每一个 key, 根据 key 获取 value
        // 1.1 获取所有的 key
        // 1.2 遍历 key 的集合, 获取到每一个 key
        // 1.3 根据 key 获取 value
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------");

        // 2. 获取所有的 value, 所有的 value 是一个 Collection 集合, 遍历 value 的集合, 获取到每一个 value
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("--------");

        // 3. 获取所有的键值对对象, 所有的键值对对象是一个 Set 集合, 遍历键值对对象的集合, 获取到每一个键值对对象, 根据键值对对象获取 key 和 value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("--------");

        // 4. 迭代器
        Set<String> stringSet = map.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------");

        // 5. JDK 1.8 之后的新技术, 使用 Lambda 表达式
        map.forEach((key, value) -> System.out.println(key + "=" + value));


    }


}
