package com.heima.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Test2
 * @Description Test2
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("Tom", 18), new Student("Jerry", 19), new Student("Mike", 17));

        // 只获取学生姓名放到数组当中
        String[] nameArr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(nameArr));
    }
}
