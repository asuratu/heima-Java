package com.heima.demo4;

/**
 * @ClassName Test
 * @Description com.heima.demo4.Test
 * @Author AsuraTu
 * @Date 2023/4/21 17:31
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 注意事项：
        // 1.静态内部类也是成员内部类中的一种
        // 2.静态内部类只能访问外部类中的静态变量和静态方法，
        // 如果想要访问外部非静态的变量和方法, 需要创建外部对象。


        // 创建静态内部类对象的格式：
        // 外部类名.内部类名 对象名= new 外部类名.内部类名()；
        // 例如: Outer.Inner oi = new Outer.Inner();
        // 创建静态内部类对象
        Outer.Inner oi = new Outer.Inner();
        oi.show2();

        // 调用内部类的静态方法的格式：
        // 外部类名.内部类名.方法名()；
        // 例如: Outer.Inner.show();
        // 调用内部类的静态方法
        Outer.Inner.show1();
    }


}
