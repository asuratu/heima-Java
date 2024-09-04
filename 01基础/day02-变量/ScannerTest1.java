import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数，请重新输入：");
            sc.next();
        }
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        while (!sc.hasNextInt()) {
            System.out.println("输入的不是整数，请重新输入：");
            sc.next();
        }
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("两数之和为：" + sum);
    }
}
