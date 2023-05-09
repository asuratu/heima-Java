package com.heima.mygenerics;

/**
 * @ClassName A02_GenericsDemo2
 * @Description com.heima.mygenerics.A02_GenericsDemo2
 * @Author AsuraTu
 * @Date 2023/5/9 14:12
 * @Version 1.0.0
 */
public class A02_GenericsDemo2 {
    public static void main(String[] args) {
        A01_MyArrayList<String> list = new A01_MyArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println(list);

        String s = list.get(1);
        System.out.println("s = " + s);

        A01_MyArrayList<Integer> list2 = new A01_MyArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list2);
    }

   
}
