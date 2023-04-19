package com.heima.demo;

/**
 * @ClassName Test
 * @Description com.heima.demo.Test
 * @Author AsuraTu
 * @Date 2023/4/19 16:39
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // Person p = new Person(); // 错误, 抽象类不能被实例化
        // p.work();

        Student s = new Student("张三");
        System.out.println(s.getName() + "是一个学生");
        s.work();
        s.eat();

    }
}
