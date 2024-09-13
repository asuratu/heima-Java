package com.heima.demo5;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Dog dog = new Dog(2, "黑颜色");
        p1.keepPet(dog, "骨头");

        // 分割线
        System.out.println("================================");

        Person p2 = new Person("老李", 25);
        Cat cat = new Cat(3, "灰颜色");
        p2.keepPet(cat, "小鱼干");
    }
}
