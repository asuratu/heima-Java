package com.heima.demo4;

/**
 * @ClassName Test
 * @Description com.heima.demo4.Test
 * @Author AsuraTu
 * @Date 2023/4/19 10:23
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", "18");
        Animal a = new Cat("3", "白");
        p.keepPet(a, "鱼");

        Person p2 = new Person("李四", "20");
        Animal a2 = new Dog("5", "黑");
        p2.keepPet(a2, "骨头");
    }
}
