package com.heima.demo3;

/**
 * @author asura
 */
public class OverseaStudent extends Student {
    // 方法重写的注意事项和要求
    // 1. 子类重写父类的方法时，访问权限不能更低
    // 2. 子类重写父类的方法时，方法名、参数列表必须一致, 返回值类型也必须一致
    // 访问权限: private < 空着不写 < protected < public  (从小到大)
    // 空着不写表示默认权限, 也就是包权限, 只能在同一个包中访问

    @Override // 重写
    public void study() {
        System.out.println("海外学生学习");
    }

    @Override
    public void eat() {
        System.out.println("海外学生吃饭");
    }
}
