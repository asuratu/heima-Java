package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName A02_Test1
 * @Description com.heima.collections.A02_Test1
 * @Author AsuraTu
 * @Date 2023/5/15 17:00
 * @Version 1.0.0
 */
public class A02_Test1 {
    public static void main(String[] args) {
        // 需求:
        // 班级有 N 个学生, 实现随机点名器

        // 1. 准备一个集合, 存储学生的姓名
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "田七");
        // 2. 打乱集合中元素的顺序
        Collections.shuffle(list);
        // 3. 遍历
        for (String s : list) {
            System.out.println(s);
        }
        
    }
}
