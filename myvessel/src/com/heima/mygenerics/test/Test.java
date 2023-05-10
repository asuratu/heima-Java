package com.heima.mygenerics.test;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description com.heima.mygenerics.test.Test
 * @Author AsuraTu
 * @Date 2023/5/9 16:38
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 需求: 定义一个继承结构
        // 1. 定义一个父类: 动物
        // 2. 定义一个子类: 猫
        // 2.1 定义一个子类: 波斯猫
        // 2.2 定义一个子类: 英短猫
        // 3. 定义一个子类: 狗
        // 3.1 定义一个子类: 泰迪
        // 3.2 定义一个子类: 哈士奇

        // 属性: 名字, 年龄
        // 行为: 吃东西
        // 波斯猫方法体打印：一只叫做XX×的，X岁的波斯猫，正在吃小饼干
        // 方法体打印：一只叫做XXx的，X岁的英短猫，正在吃鱼
        // 方法体打印：一只叫做XxX的，X岁的泰迪，正在吃骨头，边吃边蹭
        // 方法体打印：一只叫做XXx的，X岁的哈士奇，正在吃骨头，边吃边拆家

        // 测试类中, 定义一个方法用于饲养动物
        // public static void feed(ArrayList<???> list) {
        // 遍历集合, 调用动物的 eat 方法
        // }

        // 要求:
        // 1. 该方法可以养猫, 但是不能养狗
        ArrayList<Cat> list1 = new ArrayList<>();
        list1.add(new PersianCat("波斯猫", 2));
        list1.add(new EnglishShortCat("英短猫", 3));
        feedCat(list1);

        System.out.println("====================================");

        // 2. 该方法可以养狗, 但是不能养猫
        ArrayList<Dog> list2 = new ArrayList<>();
        list2.add(new TidyDog("泰迪", 2));
        list2.add(new HuskyDog("哈士奇", 3));
        feedDog(list2);

        System.out.println("====================================");
        // 3, 该方法可以所有动物, 但是不能传递其他类型的对象
        feed(list1);
        feed(list2);

        System.out.println("====================================");

        ArrayList<Animal> list3 = new ArrayList<>();
        list3.add(new PersianCat("波斯猫", 2));
        list3.add(new EnglishShortCat("英短猫", 3));
        list3.add(new TidyDog("泰迪", 2));
        list3.add(new HuskyDog("哈士奇", 3));
        feed(list3);

    }

    public static void feedCat(ArrayList<Cat> list) {
        // 遍历集合, 调用动物的 eat 方法
        for (Cat cat : list) {
            cat.eat();
        }
    }

    public static void feedDog(ArrayList<Dog> list) {
        // 遍历集合, 调用动物的 eat 方法
        for (Dog dog : list) {
            dog.eat();
        }
    }

    // 3, 该方法可以所有动物, 但是不能传递其他类型的对象
    public static void feed(ArrayList<? extends Animal> list) {
        // 遍历集合, 调用动物的 eat 方法
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
