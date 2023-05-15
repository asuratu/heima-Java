package com.heima.mymap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName A02_HashMapDemo3
 * @Description com.heima.mymap.A02_HashMapDemo3
 * @Author AsuraTu
 * @Date 2023/5/15 14:36
 * @Version 1.0.0
 */
public class A02_HashMapDemo3 {
    public static void main(String[] args) {
        // 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D),每个学生只
        // 能选择一个景点，请统计出最终哪个景点想去的人数最多。

        // 思路：
        // 1. 创建HashMap集合，键是景点名称，值是计数器

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 80; i++) {
            // 0 - 3 的随机数，代表四个景点
            int num = (int) (Math.random() * 4);
            switch (num) {
                case 0 -> addMap(map, "A");
                case 1 -> addMap(map, "B");
                case 2 -> addMap(map, "C");
                case 3 -> addMap(map, "D");
            }
        }

        // 2. 遍历集合，获取每一个键，获取每一个值
        int max = 0;
        String name = "";
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value > max) {
                max = value;
                name = key;
            }
        }

        // 3. 输出结果
        System.out.println(map);
        System.out.println("最终选择的景点是：" + name + "，有" + max + "人想去");
    }

    public static void addMap(Map<String, Integer> map, String key) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
