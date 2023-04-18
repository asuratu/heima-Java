package com.heima.demo2;

/**
 * @ClassName Test
 * @Description com.heima.demo2.Test
 * @Author AsuraTu
 * @Date 2023/4/18 17:28
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象 多态方式
        Animal a = new Dog();

        // 调用成员变量: 编译看左边, 运行看左边
        // 编译看左边: 编译看父类, 父类中没有name, 则编译失败
        // 运行看左边: 运行看子类, 子类中有name, 则运行成功
        // 就近原则: a 是Animal类型, 则就近原则找到Animal中的name
        System.out.println(a.name);

        // 调用成员方法: 编译看左边, 运行看右边
        // 编译看左边: 编译看父类, 父类中有show方法, 则编译成功
        // 运行看右边: 运行看子类, 子类中有show方法, 则运行成功
        // 虚方法表中, 子类的show方法覆盖了父类的show方法
        a.show();

    }
}
