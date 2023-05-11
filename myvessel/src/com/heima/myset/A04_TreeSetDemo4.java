package com.heima.myset;

import java.util.TreeSet;

/**
 * @ClassName A04_TreeSetDemo4
 * @Description com.heima.myset.A04_TreeSetDemo4
 * @Author AsuraTu
 * @Date 2023/5/11 17:44
 * @Version 1.0.0
 */
public class A04_TreeSetDemo4 {
    public static void main(String[] args) {
        // 需求：创建5个学生对象
        // 属性：（姓名,年龄，语文成绩,数学成绩，英语成绩），
        // 按照总分从高到低输出到控制台
        // 如果总分一样，按照语文成绩排
        // 如果语文一样，按照数学成绩排
        // 如果数学成绩一样，按照英语成绩排
        // 如果英文成绩一样，按照年龄排
        // 如果年龄一样，按照姓名的字母顺序排
        // 如果都一样，认为是同一个学生，不存。

        // 1. 创建集合对象
        TreeSet<Score> ts = new TreeSet<>();
        ts.add(new Score("a", 23, 90, 90, 90));
        ts.add(new Score("b", 24, 90, 90, 90));
        ts.add(new Score("c", 22, 90, 90, 91));
        ts.add(new Score("d", 23, 91, 90, 90));
        ts.add(new Score("d", 23, 90, 91, 90));
        ts.add(new Score("d", 23, 90, 91, 90));

        // 2. 遍历集合
        for (Score s : ts) {
            System.out.println(s);
        }
    }
}
