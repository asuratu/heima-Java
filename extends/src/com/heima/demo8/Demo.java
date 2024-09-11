package com.heima.demo8;

/**
 * @ClassName Demo
 * @Description Demo
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("经理的信息:");
        Manager manager = new Manager("002", "王经理", 5000, 10000);
        manager.eat();
        manager.work();
        manager.manageBonus();
        System.out.println(manager);

        System.out.println("厨师的信息:");
        Chef chef = new Chef("003", "张厨师", 3000);
        chef.eat();
        chef.work();
        System.out.println(chef);
    }
}
