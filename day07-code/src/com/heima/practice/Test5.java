package com.heima.practice;

public class Test5 {
    public static void main(String[] args) {
        // 评委打分
        // 需求：
        // 在唱歌比赛中，有6名评委给选手打分，分数范围是10-100]之间的整数。选手的最后得分为：去掉最
        // 高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

        // 1. 定义一个数组，用来存储评委的打分
        int[] arr = new int[6];
        // 2. 给数组中的元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 91 + 10);
        }
        // 3. 打印数组中的元素
        for (int k : arr) {
            System.out.println(k);
        }
        // 4. 定义一个变量，用来存储最大值
        int max = arr[0];
        // 5. 定义一个变量，用来存储最小值
        int min = arr[0];
        // 6. 定义一个变量，用来存储总分
        int sum = 0;
        // 7. 遍历数组，获取数组中的元素
        for (int j : arr) {
            // 8. 判断元素的值是否大于max
            if (j > max) {
                // 9. 如果大于max，就将元素的值赋值给max
                max = j;
            }
            // 10. 判断元素的值是否小于min
            if (j < min) {
                // 11. 如果小于min，就将元素的值赋值给min
                min = j;
            }
            // 12. 将元素的值累加到sum中
            sum += j;
        }

        // 13. 计算平均分
        double avg = (double) (sum - max - min) / (arr.length - 2);
        // 14. 打印平均分
        System.out.println("平均分：" + avg);
    }
}
