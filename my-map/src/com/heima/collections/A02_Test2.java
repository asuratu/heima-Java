package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName A02_Test2
 * @Description com.heima.collections.A02_Test2
 * @Author AsuraTu
 * @Date 2023/5/15 17:08
 * @Version 1.0.0
 */
public class A02_Test2 {
    public static void main(String[] args) {
        // 班级里有N个学生, 随机点名, 要求不点重复的学生
        // 要求：
        // 70%的概率随机到男生
        // 30%的概率随机到女生

        // 1. 准备一个集合, 存储男生
        ArrayList<String> maleList = new ArrayList<>();
        Collections.addAll(maleList, "张三", "李四", "王五", "赵六", "田七");
        Collections.shuffle(maleList);
        // 2. 准备一个集合, 存储女生
        ArrayList<String> femaleList = new ArrayList<>();
        Collections.addAll(femaleList, "小花", "小红", "小绿", "小蓝", "小紫");
        Collections.shuffle(femaleList);
        // 3. 随机点名
        // flag 为 true 代表随机到男生, 为 false 代表随机到女生

        while (true) {
            boolean flag = getProbability();
            if (flag) {
                // 随机到男生
                // 1. 判断男生集合是否为空
                if (maleList.size() == 0) {
//                    System.out.println("男生已经点完了");
                    continue;
                }
                // 2. 取出第一个男生
                String name = maleList.remove(0);
                System.out.println("随机到男生: " + name);
            } else {
                // 随机到女生
                // 1. 判断女生集合是否为空
                if (femaleList.size() == 0) {
//                    System.out.println("女生已经点完了");
                    continue;
                }
                // 2. 取出第一个女生
                String name = femaleList.remove(0);
                System.out.println("随机到女生: " + name);
            }

            // 3. 判断男生集合和女生集合是否都为空
            if (maleList.size() == 0 && femaleList.size() == 0) {
                System.out.println("所有学生都点完了");
                break;
            }
        }
    }


    // 计算概率, 70% 的概率返回 true, 30% 的概率返回 false
    public static boolean getProbability() {
        int random = (int) (Math.random() * 100 + 1);
        return random <= 70;
    }

    public static boolean getProbability2() {
        ArrayList<Integer> list = new ArrayList<>();
        // 存储 7 个 1 代表男生, 3 个 0 代表女生
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);
        // 取第一个元素
        Integer i = list.get(0);
        if (i == 1) {
            System.out.println("随机到男生");
        } else {
            System.out.println("随机到女生");
        }
        return i == 1;
    }


}
