package com.heima.test;

public class StudentDemoTest {
    public static void main(String[] args) {
        // 学生数组
        StudentDemo[] studentArr = new StudentDemo[3];
        StudentDemo student1 = new StudentDemo("001", "张三", 20);
        StudentDemo student2 = new StudentDemo("002", "李四", 21);
        StudentDemo.add(studentArr, student1);
        StudentDemo.add(studentArr, student2);
        printStudentArr(studentArr);

        System.out.println("-----------------------");

        // 删除学生
        StudentDemo.deleteById(studentArr, "001");
        printStudentArr(studentArr);

        System.out.println("-----------------------");

        // 查找学生
        StudentDemo.findById(studentArr, "0021");
        printStudentArr(studentArr);

    }

    // 打印学生数组
    public static void printStudentArr(StudentDemo[] studentArr) {
        System.out.println("学生数组：");
        for (StudentDemo studentDemo : studentArr) {
            System.out.println(studentDemo);
        }
    }
}
