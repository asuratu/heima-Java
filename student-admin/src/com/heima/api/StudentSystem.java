package com.heima.api;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description com.heima.api.Main
 * @Author AsuraTu
 * @Date 2023/4/17 13:24
 * @Version 1.0.0
 */
public class StudentSystem {

    // 定义常量
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String GET_STUDENT = "4";
    private static final String PRINT_STUDENT = "5";
    private static final String EXIT = "6";


    public static void work() {
        // 1. 定义一个集合
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        // 只允许输入 1-6 之间的数字
        loop:
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：打印全部学生");
            System.out.println("6：退出");
            System.out.println("请输入您的选择:");

            String line = sc.nextLine();

            switch (line) {
                case ADD_STUDENT -> {
                    System.out.println("添加学生");
                    addStudent(list);
                }
                case DELETE_STUDENT -> {
                    System.out.println("删除学生");
                    deleteStudent(list);
                }
                case UPDATE_STUDENT -> {
                    System.out.println("修改学生");
                    updateStudent(list);
                }
                case GET_STUDENT -> {
                    System.out.println("查询学生");
                    getStudent(list);
                }
                case PRINT_STUDENT -> {
                    System.out.println("打印全部学生");
                    printStudentList(list);
                }
                case EXIT -> {
                    System.out.println("退出");
                    break loop; // 跳出指定的循环
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void main(String[] args) {
        work();
    }

    private static void printStudentList(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("无学生信息");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (Student student : list) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    // 根据学号查询学生信息
    private static void getStudent(ArrayList<Student> list) {
        // 1. 提示用户输入学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String id = sc.nextLine();
        // 2. 判断学号是否存在
        if (isExist(list, id)) {
            // 3. 如果存在, 提示用户输入新的学生信息
            System.out.println("学号\t姓名\t年龄\t居住地");
            for (Student student : list) {
                if (student.getId().equals(id)) {
                    System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
                    break;
                }
            }
        } else {
            // 4. 如果不存在, 提示学号不存在, 跳转到主菜单
            System.out.println("学号不存在");
        }
    }

    // 更新学生, id 存在则更新, 不存在跳转到主菜单
    private static void updateStudent(ArrayList<Student> list) {
        // 1. 提示用户输入学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String id = sc.nextLine();
        if (isExist(list, id)) {
            // 2. 判断学号是否存在
            // 3. 如果存在, 提示用户输入新的学生信息
            System.out.println("请输入新的学生信息:");
            System.out.println("请输入姓名:");
            String name = sc.nextLine();
            System.out.println("请输入年龄:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("请输入居住地:");
            String address = sc.nextLine();
            // 4. 创建新的学生对象
            Student s = new Student(id, name, age, address);
            // 5. 更新学生
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                if (student.getId().equals(id)) {
                    list.set(i, s);
                    break;
                }
            }
            // 6. 提示更新成功
            System.out.println("更新成功");
        } else {
            // 7. 如果不存在, 提示学号不存在, 跳转到主菜单
            System.out.println("学号不存在");
        }
    }

    // 删除学生, id 存在则删除, 不存在跳转到主菜单
    private static void deleteStudent(ArrayList<Student> list) {
        // 1. 提示用户输入学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String id = sc.nextLine();
        if (isExist(list, id)) {
            // 2. 判断学号是否存在
            // 3. 如果存在, 删除学生
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                if (s.getId().equals(id)) {
                    list.remove(i);
                    break;
                }
            }
            // 4. 提示删除成功
            System.out.println("删除成功");
        } else {
            // 5. 如果不存在, 提示学号不存在, 跳转到主菜单
            System.out.println("学号不存在");
        }
    }

    // 添加学生, id 不能重复
    private static void addStudent(ArrayList<Student> list) {
        // 1. 提示用户输入学生信息
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学号:");
            id = sc.nextLine();
            // 判断学号是否存在
            boolean flag = isExist(list, id);
            if (flag) {
                System.out.println("学号已存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("请输入居住地:");
        String address = sc.nextLine();

        // 2. 创建学生对象
        Student s = new Student(id, name, age, address);

        // 3. 将学生对象添加到集合中
        list.add(s);

        // 4. 提示添加成功
        System.out.println("添加成功");
    }

    // 判断学号是否存在
    private static boolean isExist(ArrayList<Student> list, String number) {
        for (Student s : list) {
            if (s.getId().equals(number)) {
                return true;
            }
        }
        return false;
    }
}
