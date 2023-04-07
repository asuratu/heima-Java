package com.heima.process;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        // 输入一个数字
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("输入的不是整数, 请重新输入。");
            sc.next();
        }
        int num = sc.nextInt();


        // 如果没有 break 语句，会继续执行下一个 case 语句，直到遇到 break 或者 } 为止。
//        switch (num) {
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期日");
//                break;
//            default:
//                System.out.println("输入的数字不在 1-7 之间");
//                break;
//        }

        // 优化
        switch (num) {
            case 1 -> {
                System.out.println("一周开始了");
                System.out.println("星期一");
            }
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6, 7 -> {
                // 合并
                System.out.println("双休日");
                System.out.println("一周结束了");
            }
            default -> System.out.println("输入的数字不在 1-7 之间");
        }

    }
}
