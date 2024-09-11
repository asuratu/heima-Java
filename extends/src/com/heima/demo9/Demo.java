package com.heima.demo9;

/**
 * @ClassName Demo
 * @Description Demo
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Demo {
    public static void main(String[] args) {
        // 讲师
        System.out.println("讲师信息：");
        Lecturer lecturer = new Lecturer("L001", "讲师1");
        lecturer.work();
        System.out.println(lecturer);

        // 助教
        System.out.println("助教信息：");
        Tutor tutor = new Tutor("T001", "助教1");
        tutor.work();
        System.out.println(tutor);
    }
}
