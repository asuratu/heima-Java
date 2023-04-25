package com.heima.object;

/**
 * @ClassName Student
 * @Description com.heima.object.Student
 * @Author AsuraTu
 * @Date 2023/4/25 11:17
 * @Version 1.0.0
 */
public class Student implements Cloneable {
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

    // 重写 equals() 方法
    @Override
    public boolean equals(Object obj) {
        // 1. 判断 obj 是否为 Student 类型
        if (obj instanceof Student s) {
            // 2. 将 obj 强转为 Student 类型
            // 3. 比较两个对象的属性值是否相同
            return this.name.equals(s.name) && this.age == s.age;
        }
        return false;
    }

    // 重写 clone() 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 重写 toString() 方法
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
