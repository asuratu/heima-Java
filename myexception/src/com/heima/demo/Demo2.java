package com.heima.demo;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo2 {
    public static void main(String[] args) {
        Student student = new Student("Tom", 18);
        try {
            student.setAge(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
