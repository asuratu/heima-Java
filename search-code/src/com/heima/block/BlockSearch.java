package com.heima.block;

import java.util.Arrays;

/**
 * @ClassName BlockSearch
 * @Description com.heima.block.BlockSearch
 * @Author AsuraTu
 * @Date 2023/4/27 13:46
 * @Version 1.0.0
 */
public class BlockSearch {
    public static void main(String[] args) {
        // 分块查找
        // 需求: 在 1-1000 之间获取 20 个随机数, 要求不重复

        // 1. 定义一个数组, 用来存储随机数
        int[] arr = new int[20];

        // 2. 定义一个索引, 从 0 开始
        int index = 0;

        // 9. 如果到达, 就结束循环
        do {
            // 4. 生成随机数
            int random = (int) (Math.random() * 21 + 1);

            // 5. 判断随机数是否在数组中存在
            if (!isExist(arr, random)) {
                // 6. 如果不存在, 就把随机数存储到数组中
                arr[index] = random;

                // 7. 索引自增
                index++;
            }

            // 8. 判断索引是否到达数组的最大索引
        } while (index != arr.length);

        // 3. 遍历数组
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isExist(int[] arr, int random) {
        // 1. 定义一个标记
        boolean flag = false;

        // 2. 遍历数组, 获取到数组中的每一个元素
        for (int j : arr) {
            // 3. 拿数组中的元素和随机数进行比较
            if (j == random) {
                // 4. 如果相等, 就把标记改为 true, 并结束循环
                flag = true;
                break;
            }
        }

        // 5. 返回标记
        return flag;
    }
}
