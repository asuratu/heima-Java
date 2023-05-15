package com.heima.mymap;

/**
 * @ClassName Student
 * @Description com.heima.mymap.Student
 * @Author AsuraTu
 * @Date 2023/5/15 14:14
 * @Version 1.0.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        // 如果地址值相同，直接返回true
        if (this == obj) {
            return true;
        }
        // 如果传递的参数是null，直接返回false
        if (obj == null) {
            return false;
        }
        // 如果传递的参数obj是一个类型，直接返回false
        if (getClass() != obj.getClass()) {
            return false;
        }
        // 向下转型
        Student stu = (Student) obj;
        // 比较两个对象的属性值，一个对象是this（调用者），一个对象是stu（形参）
        return this.name.equals(stu.name) && this.age == stu.age;
    }

    // 重写hashCode方法
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
