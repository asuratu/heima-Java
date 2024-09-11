package com.heima.a01staticdemo1;

/**
 * @ClassName Student
 * @Description com.heima.a01staticdemo1.Student
 * @Author AsuraTu
 * @Date 2023/4/17 16:28
 * @Version 1.0.0
 */
public class Student {
    public static String teacherName;
    // static 修饰的成员变量, 静态变量, 所有的对象共享一份数据
    // 一般用来存储对象的共性数据
    // 还可以使用 类名.静态变量 的方式访问 Student.teacherName
    // 静态变量, 推荐使用 类名.静态变量 的方式访问
    private String name;
    private String age;
    private String gender;

    public Student() {
    }

    public Student(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void show() {
        // 打印学生信息
        // \t 制表符, 在打印的时候, 把前面的字符串长度补齐到8的倍数, 最少补一个空格, 最多补8个空格
        System.out.println("姓名\t年龄\t性别\t老师\t");
        System.out.println(name + "\t" + age + "\t" + gender + "\t" + teacherName + "\t");
    }
}
