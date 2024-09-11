package com.heima.demo7;

/**
 * @ClassName Fu
 * @Description 父类
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Fu {
    String name;
    int age;

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
