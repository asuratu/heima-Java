package com.heima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName A01_CollectionDemo2
 * @Description com.heima.mycollection.A01_CollectionDemo2
 * @Author AsuraTu
 * @Date 2023/5/6 14:50
 * @Version 1.0.0
 */
public class A01_CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);

        coll.add(s1);
        coll.add(s2);

        boolean exists = coll.contains(new Student("张三", 23));
        System.out.println(exists);
    }
}
