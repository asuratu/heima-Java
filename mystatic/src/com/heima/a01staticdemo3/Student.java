package com.heima.a01staticdemo3;

/**
 * @ClassName Student
 * @Description com.heima.a01staticdemo3.Student
 * @Author AsuraTu
 * @Date 2023/4/17 17:03
 * @Version 1.0.0
 */
public class Student {
    // 学生类的属性为：name、 age、 gender
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
}
