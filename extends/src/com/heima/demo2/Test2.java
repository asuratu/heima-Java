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

class Ye1 {
    String name = "Ye1";
}

class Fu1 extends Ye1 {
    String name = "Fu1";
}

class Zi1 extends Fu1 {
    String name = "Zi1";

    public void show() {
        String name = "show";
        // 就近原则
        System.out.println(name);
        // this 表示当前对象
        System.out.println(this.name);
        // super 表示父类对象
        System.out.println(super.name);
        // 如何调用 Ye1 的 name 变量呢？
        // 调用 Ye1 的 name 变量
        System.out.println(((Ye1) this).name);
        // 或者
        Ye1 that = this;
        System.out.println(that.name);
    }
}
