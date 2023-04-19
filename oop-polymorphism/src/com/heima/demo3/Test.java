package com.heima.demo3;

/**
 * @ClassName Test
 * @Description com.heima.demo3.Test
 * @Author AsuraTu
 * @Date 2023/4/19 09:55
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
// 创建对象 多态方式
        Animal a = new Dog();

        // 多态的弊端: 不能使用子类特有的方法
        // 因为编译看左边, 左边是Animal类型, Animal类型中没有lookHome方法, 所以编译失败
        // a.lookHome();

        // 解决方案: 向下转型
        // 向下转型: 强制类型转换
        Dog d = (Dog) a;
        d.lookHome();

        // JDK14新特性: instanceof
        if (a instanceof Dog d2) {
            d2.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("不是猫也不是狗");
        }

    }
}
