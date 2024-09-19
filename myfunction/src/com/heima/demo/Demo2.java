package com.heima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo2 {
    public static void main(String[] args) {
        // 方法引用 (引用构造方法)
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,19", "李四,20", "王五,21");

        // 转换为 Student 对象
        List<Student> list1 = list.stream().map(Student::new).toList();
        System.out.println(list1);
    }
}
