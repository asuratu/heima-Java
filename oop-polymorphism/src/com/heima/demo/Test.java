package com.heima.demo;

/**
 * @ClassName Test
 * @Description com.heima.demo.Test
 * @Author AsuraTu
 * @Date 2023/4/18 17:12
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        register(s);

        System.out.println("------------");

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(30);
        register(t);

        System.out.println("------------");

        Administrator a = new Administrator();
        a.setName("王五");
        a.setAge(40);
        register(a);

        System.out.println("------------");
    }

    // 形参是父类, 实参是子类  ------> 多态
    public static void register(Person p) {
        p.show();
    }
}
