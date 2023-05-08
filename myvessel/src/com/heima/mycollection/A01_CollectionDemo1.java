package com.heima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName A01_CollectionDemo1
 * @Description com.heima.mycollection.A01_CollectionDemo1
 * @Author AsuraTu
 * @Date 2023/5/4 17:26
 * @Version 1.0.0
 */
public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        // public boolean add(E e)：  把给定的对象添加到当前集合中 。
        // public void clear() :清空集合中所有的元素。
        // public boolean remove(E e): 把给定的对象在当前集合中删除。
        // public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        // public boolean isEmpty(): 判断当前集合是否为空。
        // public int size(): 返回集合中元素的个数。

        // 注意点：
        // Collection 是所有单列集合的父接口，因为它定义了单列集合(动态数组)的共性方法。
        // 所有的单列集合都可以使用共性的方法。

        Collection<String> coll = new ArrayList<>();

        // 1. 添加元素
        // 细节1: 如果是往List系列集合中添加数据, 那么方法永远返回true, 因为List系列集合中可以添加重复的数据
        // 细节2: 如果是往Set系列集合中添加数据, 那么方法会通过比较返回boolean值, 如果是重复的数据, 那么返回false, 如果是不重复的数据, 那么返回true
        coll.add("张三");
        coll.add("张三");
        coll.add("李四");

        // 2. 清空元素
        // coll.clear();

        // 3. 删除元素
        // 细节1: 如果删除的元素不存在, 那么返回false
        // 细节2: 如果删除的元素存在, 删除第一个出现的元素, 返回true
        coll.remove("张三");

        // 4. 判断元素是否存在
        // 细节1: 如果集合存储的是基本数据类型, 那么==比较的是值
        // 细节2: 如果集合存储的是自定义的javabean对象, 那么要实现equals方法, 才能使用contains方法
        boolean exists = coll.contains("张三");
        System.out.println(exists);

        // 5. 判断集合是否为空
        System.out.println(coll.isEmpty());

        // 6. 获取集合的长度
        System.out.println(coll.size());

        System.out.println(coll);

    }
}
