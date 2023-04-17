package com.heima.demo2;

// 结论: 子类继承父类
// 1. 构造方法
// 1.1 私有 => 不能
// 1.2 非私有 => 不能
// 1.2 非私有的, 子类可以通过super()调用父类的构造方法

// 2. 成员属性
// 2.1 私有 => 能, 但是不能直接访问, 只能通过 public 的 get/set 方法访问
// 2.2 非私有 => 能

// 3. 成员方法
// 3.1 私有 => 不能
// 3.2 非私有 => 能
// 虚方法表: 非 private 的方法, 非 final 的方法, 非 static 的方法, 非构造方法


/**
 * @ClassName Test
 * @Description com.heima.demo2.Test
 * @Author AsuraTu
 * @Date 2023/4/17 17:52
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建对象
        Zi z1 = new Zi();

        // 利用有参构造创建对象
        Zi z2 = new Zi("张三", 23);

    }
}

class Fu {
    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    // 如果一个类没有构造方法, 则虚拟机会默认提供一个空参构造
    // 如果子类没有构造方法, 则默认调用父类的空参构造
    public Zi() {
    }

    public Zi(String name, int i) {
        // super()必须写在第一行, 且只能写一次
        // super() 表示调用父类的构造
        super(name, i);
    }
}
