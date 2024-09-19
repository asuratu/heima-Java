package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Test1
 * @Description Demo4
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,19", "李四,20", "王五,21");

        // 转换为 Student[] 数组
        Student[] studentsArr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(studentsArr));
    }
}
