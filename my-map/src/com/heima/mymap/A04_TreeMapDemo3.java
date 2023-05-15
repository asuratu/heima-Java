package com.heima.mymap;

import java.util.StringJoiner;
import java.util.TreeMap;

/**
 * @ClassName A04_TreeMapDemo3
 * @Description com.heima.mymap.A04_TreeMapDemo3
 * @Author AsuraTu
 * @Date 2023/5/15 15:25
 * @Version 1.0.0
 */
public class A04_TreeMapDemo3 {
    public static void main(String[] args) {
        // 需求：字符串 "aababcabedabcde"
        // 请统计字符串中每一个字符出现的次数，并按照以下格式输出
        // 输出结果：
        // a (5) b (4) c (3) d (2) e (1)

        String str = "aababcabedabcde";
        // 1. 将字符串转换为字符数组
        char[] chars = str.toCharArray();
        // 2. 创建TreeMap集合，键是Character，值是Integer
        TreeMap<Character, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1);
        // 3. 遍历字符数组，得到每一个字符
        for (char c : chars) {
            // 4. 拿着字符到Map集合中去找对应的值
            Integer value = map.get(c);
            // 5. 判断值是否为null
            if (value == null) {
                // 6. 如果是null，说明字符在Map集合中不存在，就把字符作为键，1作为值存储
                map.put(c, 1);
            } else {
                // 7. 如果不是null，说明字符在Map集合中存在，就把值加1，然后重写存储该字符和值
                value++;
                map.put(c, value);
            }
        }

        // 8. 遍历Map集合，得到键和值，按照要求进行拼接
//        StringBuilder sb = new StringBuilder();
//        for (Character key : map.keySet()) {
//            Integer value = map.get(key);
//            sb.append(key).append(" (").append(value).append(") ");
//        }

        StringJoiner sb = new StringJoiner(" ");
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            sb.add(key + " (" + value + ") ");
        }
        // 9. 输出结果
        System.out.println(sb); // a (5) b (4) c (3) d (2) e (1)

    }
}
