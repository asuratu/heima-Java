package com.heima.demo5;

/**
 * @ClassName Person
 * @Description 人类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // keepPet
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
        System.out.println("年龄为" + age + "岁的" + name + ", 喂养了一只" + a.getColor() + "色的" + a.getAge() + "岁的" + type);
        a.eat(food);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
