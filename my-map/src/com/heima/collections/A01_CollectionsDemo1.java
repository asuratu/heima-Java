package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName A01_CollectionsDemo1
 * @Description com.heima.collections.A01_CollectionsDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 16:42
 * @Version 1.0.0
 */
public class A01_CollectionsDemo1 {
    public static void main(String[] args) {
        // Collections: 集合工具类
        // 1. 批量添加元素
        // <T> boolean addAll(Collection<? super T> c, T... elements)
        // 2. 打乱顺序
        // void shuffle(List<?> list)

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        // 1. 批量添加元素
        Collections.addAll(list, "d", "e");
        System.out.println(list);
        // 2. 打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
        // 3. 排序
        Collections.sort(list);
        System.out.println(list);
        // 4. 二分查找
        // int binarySearch(List<?> list, T key) 返回值 代表的是元素在集合中的索引, 如果返回值是负数，代表元素不在集合中
        int index = Collections.binarySearch(list, "1");
        System.out.println(index);
        // 5. 反转
        Collections.reverse(list);
        System.out.println(list);
        // 6. 交换
        Collections.swap(list, 0, 1);
        System.out.println(list);
        // 7. 最值
        String max = Collections.max(list);
        System.out.println(max);
        // 8. 拷贝
        ArrayList<String> dest = new ArrayList<>();
        Collections.addAll(dest, "1", "2", "3", "4", "5");
        System.out.println(dest);
        Collections.copy(dest, list);
        System.out.println(dest);
        // 9. 替换
        boolean r = Collections.replaceAll(dest, "a", "aa");
        System.out.println(dest);

    }
}
