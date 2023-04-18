package com.heima.demo2;

/**
 * @ClassName Test2
 * @Description com.heima.demo2.Test2
 * @Author AsuraTu
 * @Date 2023/4/18 10:32
 * @Version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show();
    }
}

class Fu1 {
    String name = "Fu1";
    String hobby = "Fu1 hobby";
}

class Zi1 extends Fu1 {
    String name = "Zi1";
    String hobby = "Zi1 hobby";

    public void show() {
        String name = "show";
        System.out.println(name); // 就近原则
        System.out.println(this.name); // this 表示当前对象
        System.out.println(super.name); // super 表示父类对象
        System.out.println(hobby); // 就近原则
        System.out.println(this.hobby); // this 表示当前对象
        System.out.println(super.hobby); // super 表示父类对象
    }
}
