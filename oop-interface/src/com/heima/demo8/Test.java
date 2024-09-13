package com.heima.demo8;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author AsuraTu
 * @Date 2024/9/13
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("青蛙的信息: ");
        Frog frog = new Frog("小青蛙", 2);
        System.out.println(frog);
        frog.eat();
        frog.swim();

        System.out.println("狗的信息: ");
        Dog dog = new Dog("小狗", 3);
        System.out.println(dog);
        dog.eat();
        dog.swim();

        System.out.println("兔子的信息: ");
        Rabbit rabbit = new Rabbit("小兔子", 1);
        System.out.println(rabbit);
        rabbit.eat();

    }
}
