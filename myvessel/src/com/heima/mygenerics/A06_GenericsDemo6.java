package com.heima.mygenerics;

import java.util.ArrayList;

/**
 * @ClassName A06_GenericsDemo6
 * @Description com.heima.mygenerics.A06_GenericsDemo6
 * @Author AsuraTu
 * @Date 2023/5/9 15:54
 * @Version 1.0.0
 */
public class A06_GenericsDemo6 {
    // 定义一个方法, 形参是一个集合, 但是集合中的元素类型不确定
    // 为了让方法更通用, 我们使用泛型来定义

    // 泛型的上限: ? extends E
    // 泛型的下限: ? super E
//    public static <E> void print(ArrayList<E> list) {
//        // 遍历集合
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }

    public static void print(ArrayList<?> list) {
        // 遍历集合
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        print(list1);
        print(list2);
    }


}
