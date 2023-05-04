package com.heima.base;

import java.util.ArrayList;

/**
 * @ClassName BaseSearchDemo
 * @Description com.heima.base.BaseSearchDemo
 * @Author AsuraTu
 * @Date 2023/4/27 13:13
 * @Version 1.0.0
 */
public class BaseSearchDemo1 {
    public static void main(String[] args) {
        // 基本查找
        // 需求: 定义一个方法, 利用基本查找, 在数组中查找指定的元素所有出现过的位置, 返回索引集合

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 33};

        // 2. 定义一个目标元素
        int target = 331;

        ArrayList<Integer> indexList = baseSearchAll(arr, target);

        System.out.println(indexList);

    }

    private static ArrayList<Integer> baseSearchAll(int[] arr, int target) {
// 3. 定义一个索引, 从 0 开始
        ArrayList<Integer> indexList = new ArrayList<>();

        // 4. 遍历数组, 获取到数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 5. 拿数组中的元素和目标元素进行比较
            if (arr[i] == target) {
                // 6. 如果相等, 就把索引赋值给 index, 并结束循环
                indexList.add(i);
            }
        }

        // 7. 返回索引
        return indexList;
    }

}
