package com.heima.demo;

/**
 * @ClassName Person
 * @Description com.heima.demo.Person
 * @Author AsuraTu
 * @Date 2023/4/19 16:34
 * @Version 1.0.0
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        System.out.println("Person类的构造方法");
        System.out.println(name + "是一个人");
        this.name = name;
    }

    // 1. 抽象类不能被实例化
    // 2. 抽象类不一定有抽象方法, 有抽象方法的类一定是抽象类
    // 3. 抽象类的子类必须重写抽象类中的所有抽象方法, 否则子类也是抽象类
    // 4. 抽象类可以有构造方法, 用于子类创建对象时, 初始化父类成员
    public abstract void work();

    public void eat() {
        System.out.println("吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
