package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Test3
 * @Description Test3
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("Tom", 18), new Student("Jerry", 19), new Student("Mike", 17));

        // 用 - 拼接姓名和年龄, 如 Tom-18 放到一个字符串数组中
        String[] strArr = list.stream().map(Student::toStr).toArray(String[]::new);
        System.out.println(Arrays.toString(strArr));
    }
}
