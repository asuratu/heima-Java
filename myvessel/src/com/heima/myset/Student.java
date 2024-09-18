package com.heima.myset;

/**
 * @ClassName Student
 * @Description com.heima.myset.Student
 * @Author AsuraTu
 * @Date 2023/5/11 11:05
 * @Version 1.0.0
 */
public class Student implements Comparable<Student> {
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

    // 重写hashCode方法
    @Override
    public int hashCode() {
        return name.hashCode() + age;
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

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
        // this 表示当前要添加的元素
        // o 表示已经在红黑树中的元素
        // 返回值:
        // 正数: 认为要添加的元素是小的, 存储在左子树
        // 负数: 认为要添加的元素是大的, 存储在右子树
        // 0: 认为元素重复了, 不存储

        // 按照年龄降序排序
        int num = o.age - this.age;
        // 正数降序, 负数升序
        // 如果年龄相同，按照姓名降序排序
        return num == 0 ? o.name.compareTo(this.name) : num;
    }

}
