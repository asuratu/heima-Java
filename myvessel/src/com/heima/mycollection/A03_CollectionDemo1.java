package com.heima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @ClassName A03_CollectionDemo1
 * @Description com.heima.mycollection.A03_CollectionDemo1
 * @Author AsuraTu
 * @Date 2023/5/8 09:19
 * @Version 1.0.0
 */
public class A03_CollectionDemo1 {
    public static void main(String[] args) {
        // Collection 系列集合的三种通用遍历方式
        // 1.迭代器
        // 2.增强for循环
        // 3.lambda表达式

        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        // 1. 获取迭代器
        // Iterator<E> iterator(): 返回此集合中元素的迭代器，通过集合的iterator()方法得到
        // 注意点: Iterator<E>是一个接口, 我们无法直接使用, 需要使用它的实现类对象
        // Iterator<E>接口的常用方法
        // boolean hasNext(): 如果仍有元素可以迭代，则返回 true。
        // E next(): 返回迭代的下一个元素。
        // 注意点: Iterator<E>接口是有 泛型的, 如果使用Iterator<E>接口接收, 那么迭代器中的泛型就是什么泛型
        Iterator<String> iterator = coll.iterator();

        // 2. 遍历集合
        while (iterator.hasNext()) {
            String s = iterator.next();

            // 注意点: 在遍历的过程中, 不能使用集合的方法操作集合的长度, 否则会发生并发修改异常
            // 为什么会发生并发修改异常呢?
            // 因为在获取迭代器的时候, 迭代器会记录集合的长度, 在遍历的过程中, 会使用集合的方法修改集合的长度, 导致迭代器记录的长度和实际集合的长度不一致, 就会发生并发修改异常
            // coll.add("赵六"); //  java.util.ConcurrentModificationException
            // 注意点: 所以在遍历的过程中, 可以使用迭代器的方法来删除元素
            if ("王五".equals(s)) {
                iterator.remove();
                continue;
            }

            System.out.println(s);
        }

        // 遍历完了之后, 指针不会复位
//        System.out.println(iterator.hasNext()); // false
//        System.out.println(iterator.next()); // java.util.NoSuchElementException
        // 如果要再次遍历, 需要重新获取迭代器


        System.out.println("--------");

        // 3. 增强for循环
        // 所有的单列集合和数组才能使用增强for循环遍历
        // 格式: for(元素的数据类型 变量名 : 数组或者集合) { }
        // idea 快速生成方式  coll.for
        // 注意点: 增强for循环底层使用的也是迭代器, 所以在遍历的过程中, 不能使用集合的方法操作集合的长度, 否则会发生并发修改异常
        for (String s : coll) {
            // 这里的 s 是局部变量, 不能修改集合中的元素
            s = s + "22";
            System.out.println(s);
        }

        System.out.println("--------");

        // 匿名内部类
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                s = s + "33";
                System.out.println(s);
            }
        });

        // 4. lambda表达式
        // lambda表达式也可以用来遍历集合
        // 格式: 集合名.forEach(元素 -> { System.out.println(元素); });
        // 注意点: lambda表达式底层使用的也是迭代器, 所以在遍历的过程中, 不能使用集合的方法操作集合的长度, 否则会发生并发修改异常
        coll.forEach(s -> {
            s = s + "1";
            System.out.println(s);
        });

        System.out.println("--------");

        // 5. 方法引用
        // 格式: 集合名.forEach(System.out::println);
        // 注意点: 方法引用底层使用的也是迭代器, 所以在遍历的过程中, 不能使用集合的方法操作集合的长度, 否则会发生并发修改异常
        coll.forEach(System.out::println);

    }
}
