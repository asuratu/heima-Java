package com.heima.mygenerics;

/**
 * @ClassName A04_GenericsDemo4
 * @Description com.heima.mygenerics.A04_GenericsDemo4
 * @Author AsuraTu
 * @Date 2023/5/9 15:27
 * @Version 1.0.0
 */
public class A04_GenericsDemo4 {
    public static void main(String[] args) {
        // 泛型接口的两种使用方式
        // 1. 在实现类中指定泛型的具体类型
        // 2. 实现类延续泛型, 创建对象的时候指定泛型的具体类型

        MyArrayList2 list = new MyArrayList2();

        MyArrayList3<String> list2 = new MyArrayList3<>();

    }
}
