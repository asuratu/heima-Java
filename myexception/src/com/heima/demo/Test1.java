package com.heima.demo;

import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description Test1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入一个姓名：");
                String name = scanner.nextLine();
                girlFriend.setName(name);
                System.out.println("请输入年龄：");
                String age = scanner.nextLine();
                girlFriend.setAge(Integer.parseInt(age));
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄必须是整数，请重新输入！");
            } catch (NameFormatException e) {
                System.out.println("姓名格式不正确，请重新输入！");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close(); // 关闭资源
        System.out.println(girlFriend);
    }
}



