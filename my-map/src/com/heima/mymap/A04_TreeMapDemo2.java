package com.heima.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName A04_TreeMapDemo2
 * @Description com.heima.mymap.A04_TreeMapDemo2
 * @Author AsuraTu
 * @Date 2023/5/15 15:17
 * @Version 1.0.0
 */
public class A04_TreeMapDemo2 {
    public static void main(String[] args) {
        // 键：学生对象
        // 值：籍贯
        // 要求：按照学生年龄的升序排列，年龄一样按照姓名的字母降序排列，同姓名年龄视为同一个人。

        TreeMap<TreeMapStudent, String> map = new TreeMap<>(Comparator.comparingInt(TreeMapStudent::getAge).thenComparing(TreeMapStudent::getName).reversed());

        map.put(new TreeMapStudent("a", 23), "北京");
        map.put(new TreeMapStudent("b", 24), "上海");
        map.put(new TreeMapStudent("c", 25), "广州");
        map.put(new TreeMapStudent("d", 22), "深圳");
        map.put(new TreeMapStudent("e", 23), "杭州");

        System.out.println(map);
    }
}
