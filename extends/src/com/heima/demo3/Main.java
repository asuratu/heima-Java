package com.heima.demo3;

/**
 * @ClassName Main
 * @Description com.heima.demo3.Main
 * @Author AsuraTu
 * @Date 2023/4/18 11:08
 * @Version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        // 调用方法
        s.study();
        s.eat();

        // 创建对象
        OverseaStudent os = new OverseaStudent();
        // 调用方法
        os.study();
        os.eat();

        // 方法重写的注意事项和要求
        // 1. 子类重写父类的方法时，访问权限不能更低
        // 2. 子类重写父类的方法时，方法名、参数列表必须一致, 返回值类型也必须一致
        // 访问权限: private < 空着不写 < protected < public  (从小到大)
        // 空着不写表示默认权限, 也就是包权限, 只能在同一个包中访问
    }
}
