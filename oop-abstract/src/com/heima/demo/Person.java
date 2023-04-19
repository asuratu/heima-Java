package com.heima.demo;

// 抽象类和接口的区别
// 1. 抽象类和接口都不能被实例化
// 2. 抽象类中可以有抽象方法和非抽象方法, 接口中只能有抽象方法
// 3. 抽象类中可以有构造方法, 接口中不能有构造方法
// 4. 抽象类中可以有成员变量, 接口中只能有常量
// 5. 抽象类中可以有静态方法, 接口中不能有静态方法
// 6. 抽象类中可以有成员方法, 接口中只能有抽象方法
// 7. 抽象类中可以有代码块, 接口中不能有代码块
// 8. 抽象类中可以有构造代码块, 接口中不能有构造代码块
// 9. 抽象类中可以有普通内部类, 接口中不能有普通内部类
// 10. 抽象类中可以有抽象内部类, 接口中不能有抽象内部类
// 11. 抽象类中可以有静态内部类, 接口中不能有静态内部类
// 12. 抽象类中可以有成员内部类, 接口中不能有成员内部类
// 13. 抽象类中可以有私有成员, 接口中不能有私有成员
// 14. 抽象类中可以有私有方法, 接口中不能有私有方法
// 15. 抽象类中可以有私有构造方法, 接口中不能有私有构造方法
// 16. 抽象类中可以有final修饰的成员, 接口中不能有final修饰的成员
// 17. 抽象类中可以有final修饰的方法, 接口中不能有final修饰的方法
// 18. 抽象类中可以有final修饰的类, 接口中不能有final修饰的类


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
