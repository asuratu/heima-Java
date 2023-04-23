package com.heima.demo6;

/**
 * @ClassName Test
 * @Description com.heima.demo6.Test
 * @Author AsuraTu
 * @Date 2023/4/23 09:16
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 匿名内部类的格式：
        // new 父类或者接口(){
        //     重写父类或者接口中的方法
        // }

        // 匿名内部类的使用场景：
        // 1.当父类或者接口的子类对象只需要使用一次的时候，就可以使用匿名内部类。
        // 2.匿名内部类可以简化代码的书写。
        // 3.匿名内部类的本质是一个继承了父类或者实现了接口的子类匿名对象。

        new Swim() {
            @Override
            public void swim() {
                System.out.println("我会游泳");
            }
        }.swim();

    }
}
