package com.heima.demo;

import java.util.Arrays;

/**
 * @ClassName Test1
 * @Description com.heima.demo.Test1
 * @Author AsuraTu
 * @Date 2023/4/27 17:01
 * @Version 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        // 要求1：属性有姓名、年龄、身高。
        // 要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        // (姓名中不要有中文或特殊字符，会涉及到后面的知识）

        // 定义数组并存储一些女朋友对象
        GirlFriend[] gfs = {
                new GirlFriend("a1", 18, 165),
                new GirlFriend("a2", 18, 160),
                new GirlFriend("b3", 18, 170),
                new GirlFriend("b2", 19, 170),
                new GirlFriend("b1", 19, 170),
                new GirlFriend("a4", 20, 175),
                new GirlFriend("a3", 20, 170),
                new GirlFriend("c1", 20, 180),
        };

        // 利用Arrays中的sort方法进行排序
        // 要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。

        // 1.按照年龄的大小进行排序
        // 2.年龄一样，按照身高排序
        // 3.身高一样按照姓名的字母进行排序
        // 4.姓名中不要有中文或特殊字符，会涉及到后面的知识

        Arrays.sort(gfs, (o1, o2) -> {
            // 1.按照年龄的大小进行排序
            int num = o1.getAge() - o2.getAge();
            // 2.年龄一样，按照身高排序
            int num2 = num == 0 ? o1.getHeight() - o2.getHeight() : num;
            // 3.身高一样按照姓名的字母进行排序
            int result = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
            // 取相反数
            result = -result;
            return result;
        });

        // 遍历数组
        for (GirlFriend gf : gfs) {
            System.out.println("------------");
            System.out.println(gf.getAge() + "," + gf.getHeight() + "," + gf.getName());
        }
    }

}
