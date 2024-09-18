package com.heima.mygenerics;

import java.util.ArrayList;

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

/**
 * @ClassName A05_GenericsDemo5
 * @Description com.heima.mygenerics.A05_GenericsDemo5
 * @Author AsuraTu
 * @Date 2023/5/9 15:35
 * @Version 1.0.0
 */
public class A05_GenericsDemo5 {
    public static void main(String[] args) {
        // 泛型不具备继承性, 但是数据具备继承性

        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
        // public static void method(ArrayList<Ye> list) {
        // 报错, 因为泛型不具备继承性
        method(list2);
        // method(list3);

        // 数据具备继承性
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

    }

    // 泛型里面写的是什么类型, 那么参数就是什么类型
    // 泛型不具备继承性, 子类和父类的关系, 与泛型无关

    // 此时, 泛型里面写的是什么类型, 那么参数就是什么类型
    // 弊端: 传递什么类型的参数, 泛型就是什么类型, 无法做到通用
    // 希望: 本方法虽然不确定类型, 但是我希望只传递 Ye, Fu, Zi 类型的参数
    // 解决: 泛型的通配符
    //      ? 表示任意不确定的类型, 可以对类型进行限定
    //      ? extends E: 接收 E 类型或者 E 的子类型, 上限
    //      ? super E: 接收 E 类型或者 E 的父类型, 下限
    // 应用场景:
    // 1. 如果定义类, 方法, 接口时, 无法确定类型, 可以使用泛型
    // 2. 如果类, 方法, 接口中的某个功能的参数, 或者返回值类型不确定, 可以使用泛型
    // 3. 如果类, 方法, 接口中的某个功能的参数, 或者返回值类型不确定, 但是需要对类型进行限定, 可以使用泛型的上限和下限

    public static void method(ArrayList<? extends Ye> list) {
        // 遍历集合
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
