package come.heima.arrayDemo;

public class ArrayTest {
    public static void main(String[] args) {
        // 定义一个数组, 遍历求和
        int[] arr = {11, 22, 33, 44, 55};
        // 定义一个变量, 用来存储求和的结果
        int sum = 0;
        // 遍历数组
        for (int i : arr) {
            // 求和
            sum += i;
        }
        // 输出结果
        System.out.println("sum = " + sum);
    }
}
