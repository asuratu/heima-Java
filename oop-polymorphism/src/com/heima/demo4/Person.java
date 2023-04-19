package com.heima.demo4;

/**
 * @ClassName Person
 * @Description com.heima.demo4.Person
 * @Author AsuraTu
 * @Date 2023/4/19 10:18
 * @Version 1.0.0
 */
public class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal a, String food) {
        String type;
        if (a instanceof Cat c) {
            type = "猫";
            c.catchMouse();
        } else if (a instanceof Dog d) {
            type = "狗";
            d.lookHome();
        } else {
            System.out.println("不是猫也不是狗");
            return;
        }
        System.out.println("年龄为" + age + "岁的" + name + ", 喂养了一只" + a.color + "色的" + a.age + "岁的" + type);
        a.eat(food);
    }
}
