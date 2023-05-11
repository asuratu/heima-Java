package com.heima.myset;

import java.util.TreeSet;

/**
 * @ClassName A04_TreeSetDemo3
 * @Description com.heima.myset.A04_TreeSetDemo3
 * @Author AsuraTu
 * @Date 2023/5/11 17:07
 * @Version 1.0.0
 */
public class A04_TreeSetDemo3 {
    public static void main(String[] args) {
        // 需求：请自行选择比较器排序和自然排序两种方式；
        // 要求：存入四个字符串，“c”，“ab"，“df"，"qwer"
        // 按照长度排序，如果一样长则按照首字母排序

        // 只有 functional interface 函数式接口 才能使用 lambda 表达式
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            // o1 表示当前要添加的元素
            // o2 表示已经在红黑树中的元素
            // 按照长度排序，如果一样长则按照首字母排序
            int num = o1.length() - o2.length();
            return num == 0 ? o1.compareTo(o2) : num;
        });

        ts.add("df");
        ts.add("c");
        ts.add("ab");
        ts.add("qwer");

        System.out.println(ts);
    }
}
