package com.heima.erfen;

/**
 * @ClassName ErfenSearchDemo1
 * @Description com.heima.erfen.ErfenSearchDemo1
 * @Author AsuraTu
 * @Date 2023/4/27 13:24
 * @Version 1.0.0
 */
public class ErfenSearchDemo1 {
    public static void main(String[] args) {
        // 二分查找/折半查找法 (列表必须是有序的)

        // 需求: 定义一个方法, 利用二分查找, 在数组中查找指定的元素, 如果找到了, 返回索引, 如果没有找到, 返回 -1

        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        // 2. 定义一个目标元素
        int target = 33;

        int index = erfenSearch(arr, target);

        System.out.println(index);

    }

    private static int erfenSearch(int[] arr, int target) {
        // 3. 定义三个变量, start, end, mid
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        // 4. 定义一个索引, 用来记录目标元素的索引, 如果没有找到, 返回 -1
        int index = -1;

        // 5. 使用循环, 不断的缩小范围
        while (true) {
            // 6. 判断中间的元素和目标元素的大小关系
            if (arr[mid] == target) {
                // 7. 如果相等, 就把索引赋值给 index, 并结束循环
                index = mid;
                break;
            } else if (arr[mid] > target) {
                // 8. 如果中间的元素大于目标元素, 就把 end 赋值为 mid - 1
                end = mid - 1;
            } else {
                // 9. 如果中间的元素小于目标元素, 就把 start 赋值为 mid + 1
                start = mid + 1;
            }

            // 10. 判断 start 和 end 的大小关系
            if (start > end) {
                // 11. 如果 start 大于 end, 就结束循环
                break;
            }

            // 12. 重新计算 mid 的值
            mid = (start + end) / 2;
        }

        // 13. 返回索引
        return index;
    }
}
