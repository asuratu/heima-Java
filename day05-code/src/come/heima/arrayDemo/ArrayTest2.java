package come.heima.arrayDemo;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 统计数组中, 一共有多少个能被3整除的元素
        // 1. 定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        // 2. 定义一个变量, 用来记录能被3整除的元素的个数
        int count = 0;
        // 3. 遍历数组
        for (int i : arr) {
            // 4. 判断元素是否能被3整除
            if (i % 3 == 0) {
                // 5. 如果能被3整除, 就将count++
                count++;
            }
        }
        // 6. 输出结果
        System.out.println("count = " + count);

    }
}
