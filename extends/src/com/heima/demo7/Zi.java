package com.heima.demo7;

/**
 * @ClassName Zi
 * @Description 子类
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Zi extends Fu {
    // 调用父类的有参构造
//    public Zi(String name, int age) {
//        super(name, age);
//        System.out.println("子类构造方法");
//    }

    // 会默认调用父类的空参构造, super()
    public Zi(String name, int age) {
        System.out.println("子类构造方法");
        this.name = name;
        this.age = age;
    }
}
