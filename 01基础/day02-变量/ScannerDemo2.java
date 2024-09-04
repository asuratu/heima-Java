import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");

        String input = sc.nextLine();
        System.out.println("输入的字符串为：" + input);
    }
}
