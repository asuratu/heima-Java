package com.heima.a01staticdemo1;

/**
 * @ClassName StudentTest
 * @Description com.heima.a01staticdemo1.StudentTest
 * @Author AsuraTu
 * @Date 2023/4/17 16:38
 * @Version 1.0.0
 */
public class StudentTest {
    public static void main(String[] args) {
// 创建学生对象
        Student s1 = new Student("张三", "23", "男");
        // 给学生对象的老师属性赋值
        Student.teacherName = "张老师";
        // 调用方法
        s1.study();
        s1.show();

        System.out.println("---------------");

        Student s2 = new Student("李四", "24", "女");
        s2.study();
        s2.show();
    }
}
