package com.heima.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName A04_TreeMapDemo1
 * @Description com.heima.mymap.A04_TreeMapDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 15:11
 * @Version 1.0.0
 */
public class A04_TreeMapDemo1 {
    public static void main(String[] args) {
        // 键：整数表示id
        // 值：字符串表示商品名称
        // 要求：按照id的升序排列、按照id的降序排列

        // 升序
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.comparingInt(o -> o));
        map.put(3, "小米");
        map.put(1, "华为");
        map.put(2, "苹果");
        map.put(4, "三星");
        System.out.println(map); // {1=华为, 2=苹果, 3=小米, 4=三星}

        // 降序
        TreeMap<Integer, String> map2 = new TreeMap<>((o1, o2) -> o2 - o1);
        map2.put(3, "小米");
        map2.put(1, "华为");
        map2.put(2, "苹果");
        map2.put(4, "三星");
        System.out.println(map2); // {4=三星, 3=小米, 2=苹果, 1=华为}

    }
}
