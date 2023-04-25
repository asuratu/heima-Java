package com.heima.object;

import com.google.gson.Gson;

import java.util.Objects;

/**
 * @ClassName demo
 * @Description com.heima.object.demo
 * @Author AsuraTu
 * @Date 2023/4/25 10:01
 * @Version 1.0.0
 */
public class demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // toString() 方法, 返回对象的字符串表示形式
        Object obj = new Object();
        String s = obj.toString();
        System.out.println(s); // java.lang.Object@2f92e0f4

        // equals() 方法, 比较两个对象的内容是否相同
        // 1. 比较的是两个对象的地址值
        // 2. 如果需要比较两个对象的内容是否相同，需要重写 equals() 方法
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);
        Student s3 = s1;
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true

        String s4 = "abc";
        StringBuilder s5 = new StringBuilder("abc");
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4.equals("abc")); // true
        System.out.println(s5.equals(s4)); // false
        System.out.println(s5.equals("abc")); // false

        // clone() 方法, 克隆一个对象
        // 1. 如果一个类没有实现 Cloneable 接口，调用 clone() 方法会抛出 CloneNotSupportedException 异常
        // 2. 如果一个类实现了 Cloneable 接口，但是没有重写 clone() 方法，调用 clone() 方法会抛出 CloneNotSupportedException 异常
        // 3. 如果一个类实现了 Cloneable 接口，并且重写了 clone() 方法，调用 clone() 方法会返回一个新的对象
        Student s6 = new Student("李四", 24);
        Student s7 = (Student) s6.clone();
        System.out.println(s6.equals(s7)); // true
        s7.setName("王五1");
        System.out.println(s7);
        System.out.println(s6);

        // 深克隆: 克隆的对象和原对象的属性值相同，但是是两个不同的对象
        // 浅克隆: 克隆的对象和原对象的属性值相同，是同一个对象
        // Object 类中的 clone() 方法是浅克隆

        // 第三方克隆工具类
        // 1. Apache Commons Lang
        // 2. Google Gson
        // 3. FastJson
        // 4. Jackson

        Gson gson = new Gson();
        Student s8 = gson.fromJson(gson.toJson(s6), Student.class);
        System.out.println(s8);
        System.out.println(Student.class);

        // objects
        // 1. Objects.equals()
        Student s9 = new Student("张三", 23);
        Student s10 = null;
        // System.out.println(s10.equals(s9)); // NullPointerException 异常
        System.out.println(Objects.equals(s9, s10)); // false
        // 细节:
        // 1. 如果两个对象都为 null, 返回 true
        // 2. 如果两个对象都不为 null, 调用 s9 的 equals() 方法比较两个对象的内容是否相同
        // 3. 如果两个对象中有一个为 null, 返回 false
        // isNull()
        System.out.println(Objects.isNull(s10)); // true
        // nonNull()
        System.out.println(Objects.nonNull(s10)); // false


    }
}
