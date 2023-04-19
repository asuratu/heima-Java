package com.heima.demo1;

/**
 * @ClassName CodeBlockDemo
 * @Description com.heima.demo1.CodeBlockDemo
 * @Author AsuraTu
 * @Date 2023/4/19 15:49
 * @Version 1.0.0
 */
public class CodeBlockDemo {
    static {
        System.out.println("静态代码块");
    }

    private String name;
    private int age;

    // 静态代码块 (写在成员位置的代码块)
    // 1. 静态代码块是给类进行初始化的
    // 2. 静态代码块在类加载的时候执行, 只执行一次
    // 3. 静态代码块优先于主方法执行

    // 构造代码块 (写在成员位置的代码块)
    // 1. 构造代码块是给所有的构造方法进行共性初始化
    // 2. 构造代码块在构造方法之前执行
    // 3. 不够灵活, 现在渐渐淘汰了, 一般不用
    {
        System.out.println("构造代码块");
    }

    public CodeBlockDemo() {
        System.out.println("无参构造方法");
    }

    public CodeBlockDemo(String name, int age) {
        System.out.println("有参构造方法");
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
}
