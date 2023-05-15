package com.heima.mymap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName A02_HashMapDemo2
 * @Description com.heima.mymap.A02_HashMapDemo2
 * @Author AsuraTu
 * @Date 2023/5/15 14:13
 * @Version 1.0.0
 */
public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        // 需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        // 存储三个键值对元素，并遍历
        // 要求：同姓名，同年龄认为是同一个学生

        // 核心点: 如果键是自定义对象，那么要重写hashCode和equals方法，建立自己的比较方式

        Map<Student, String> map = new HashMap<>();
        map.put(new Student("张三", 23), "北京");
        map.put(new Student("李四", 24), "上海");
        map.put(new Student("王五", 25), "广州");
        map.put(new Student("张三", 23), "深圳"); // 相同的键，值会覆盖

        // 使用 keySet 遍历
        for (Student key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "的籍贯是：" + value);
        }

        System.out.println("--------");

        // 使用 entrySet 遍历
        for (Map.Entry<Student, String> entry : map.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "的籍贯是：" + value);
        }

        System.out.println("--------");

        // 使用 Lambda 表达式遍历
        map.forEach((key, value) -> System.out.println(key + "的籍贯是：" + value));

    }
}
