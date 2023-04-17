package com.heima.api;

import java.util.ArrayList;
import java.util.Scanner;

import static com.heima.api.StudentSystem.work;

/**
 * @ClassName Auth
 * @Description com.heima.api.Auth
 * @Author AsuraTu
 * @Date 2023/4/17 14:12
 * @Version 1.0.0
 */
public class Auth {
    public static void main(String[] args) {
        // 用户列表
        ArrayList<User> userList = new ArrayList<>();

        // 添加默认用户
        userList.add(new User("admin", "admin", "421124199209286019", "15021039435"));

        System.out.println("欢迎来到学生管理系统");

        loop:
        while (true) {

            System.out.println("================================");

            System.out.println("请选择操作: 1登录 2注册 3忘记密码 4查询全部用户 5退出");

            // 1. 接收用户输入的操作选项
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.println("登录");
                    if (login(userList)) {
                        work();
                    }
                }
                case "2" -> {
                    System.out.println("注册");
                    register(userList);
                    work();
                }
                case "3" -> {
                    System.out.println("忘记密码");
                    forgetPassword(userList);
                }
                case "4" -> {
                    System.out.println("查询全部用户");
                    printUserList(userList);
                }
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    private static void printUserList(ArrayList<User> userList) {
        System.out.println("用户名\t密码\t身份证号\t手机号");
        for (User user : userList) {
            System.out.println(user.getUsername() + "\t" + user.getPassword() + "\t" + user.getIdCard() + "\t" + user.getPhone());
        }
    }


    // 1. 定义方法，实现用户注册功能
    private static void register(ArrayList<User> userList) {
        String username;
        String password;
        String idCard;
        String phone;
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 输入用户名
            System.out.println("请输入用户名:");
            username = sc.nextLine();

            // 检查用户名是否合法
            if (checkUsernameInList(userList, username)) {
                break;
            }

            System.out.println("用户名不合法，请重新输入");
        }

        password = inputPassword(sc);

        idCard = inputIdCard(sc);

        phone = inputPhone(sc);

        // 保存用户信息
        // 1. 创建用户对象
        User user = new User(username, password, idCard, phone);
        // 2. 将用户对象添加到集合中
        userList.add(user);

        System.out.println("注册成功");
    }

    private static String inputPhone(Scanner sc) {
        String phone;
        while (true) {
            // 输入手机号
            System.out.println("请输入手机号:");
            phone = sc.nextLine();

            // 检查手机号是否合法
            if (checkPhone(phone)) {
                break;
            }

            System.out.println("手机号不合法，请重新输入");
        }
        return phone;
    }

    private static String inputPassword(Scanner sc) {
        String password;
        while (true) {
            // 输入两次密码
            System.out.println("请输入密码:");
            password = sc.nextLine();
            System.out.println("请再次输入密码:");
            String password2 = sc.nextLine();

            // 检查两次密码是否一致
            if (password.equals(password2)) {
                break;
            }

            System.out.println("两次密码不一致，请重新输入");
        }
        return password;
    }

    private static String inputIdCard(Scanner sc) {
        String idCard;
        while (true) {
            // 输入身份证号
            System.out.println("请输入身份证号:");
            idCard = sc.nextLine();

            // 检查身份证号是否合法
            if (checkIdCard(idCard)) {
                break;
            }

            System.out.println("身份证号不合法，请重新输入");
        }
        return idCard;
    }

    // 检查用户名是否合法
    private static boolean checkUsernameInList(ArrayList<User> userList, String username) {
        // 1. 判断用户名是否已经存在
        if (usernameIsExist(userList, username)) {
            System.out.println("用户名已存在，请重新输入");
            return false;
        }

        // 2. 判断用户名是否合法
        return checkUsername(username);
    }

    // 检查用户名是否已存在
    private static boolean usernameIsExist(ArrayList<User> userList, String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // 2. 定义方法，实现用户登录功能
    private static boolean login(ArrayList<User> userList) {
        // 登录的结果
        boolean result = false;

        // 三次登录机会
        int count = 3;

        // 生成验证码
        String code = generateCode();

        System.out.println("验证码为: " + code);

        // 输入用户名和密码
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (count == 0) {
                System.out.println("登录失败，三次机会已用完");
                break;
            } else if (count > 0 && count < 3) {
                System.out.println("您还有" + count + "次机会");
            }

            // 输入用户名
            System.out.println("请输入用户名:");
            String username = sc.nextLine();

            // 输入密码
            System.out.println("请输入密码:");
            String password = sc.nextLine();

            // 输入验证码
            System.out.println("请输入验证码:");
            String inputCode = sc.nextLine();

            // 检查用户名是否存在
            if (!usernameIsExist(userList, username)) {
                System.out.println("用户名未注册，请先注册");
                break;
            }

            // 检查验证码是否正确
            if (!inputCode.equals(code)) {
                System.out.println("验证码错误，请重新输入");
                continue;
            }

            // 检查用户名和密码是否正确
            if (checkUsernameAndPassword(userList, username, password)) {
                System.out.println("登录成功");
                result = true;
                break;
            }

            System.out.println("用户名或密码错误，请重新输入");
            count--;
        }

        return result;
    }

    private static boolean checkUsernameAndPassword(ArrayList<User> userList, String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // 3. 定义方法，实现用户忘记密码功能
    private static void forgetPassword(ArrayList<User> userList) {
        // 键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
        // 键盘录入身份证号码和手机号码
        // 判断当前用户的身份证号码和手机号码是否一致，
        // 如果一致，则提示输入密码，进行修改
        // 如果不一致，则提示：账号信息不匹配，修改失败。

        Scanner sc = new Scanner(System.in);
        // 输入用户名
        System.out.println("请输入用户名:");
        String username = sc.nextLine();

        String idCard = inputIdCard(sc);
        String phone = inputPhone(sc);

        // 根据用户名查询用户
        User user = findUserByUsername(userList, username);

        // 检查用户名是否存在
        if (user == null) {
            System.out.println("用户名未注册，请先注册");
            return;
        }

        // 检查身份证号和手机号是否一致
        if (user.getIdCard().equals(idCard) && user.getPhone().equals(phone)) {
            // 一致，修改密码
            String password = inputPassword(sc);
            user.setPassword(password);
            System.out.println("修改密码成功");
        } else {
            System.out.println("账号信息不匹配，修改失败");
        }
    }

    // 根据 username 查询用户
    private static User findUserByUsername(ArrayList<User> userList, String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


    // 4. 定义方法，生成验证码
    private static String generateCode() {
        // 长度为5
        // 由4位大写或者小写字母和1位数字组成，同一个字母可以出现多次
        // 数字可以出现在任意位置

        // 1. 定义一个字符串，包含所有的大写字母和小写字母
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // 2. 定义一个字符串，包含所有的数字
        String num = "0123456789";
        // 3. 定义一个StringBuilder，用于存储验证码
        StringBuilder sb = new StringBuilder();
        // 4. 随机生成4位大写或者小写字母
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * str.length());
            char c = str.charAt(index);
            sb.append(c);
        }
        // 5. 随机生成1位数字
        int index = (int) (Math.random() * num.length());
        char c = num.charAt(index);
        // 6. 将数字插入到验证码的任意位置
        index = (int) (Math.random() * 5);
        sb.insert(index, c);
        // 7. 将验证码转换为字符串
        return sb.toString();
    }

    // 5. 校验身份证号
    private static boolean checkIdCard(String idCard) {
        // 长度为18位
        if (idCard.length() != 18) {
            return false;
        }
        // 不能以0为开
        if (idCard.startsWith("0")) {
            return false;
        }
        // 前17位，必须都是数字
        for (int i = 0; i < 17; i++) {
            char c = idCard.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        // 最为一位可以是数字，也可以是大写X或小写x
        char c = idCard.charAt(17);
        if (c < '0' || c > '9') {
            return c == 'X' || c == 'x';
        }
        return true;
    }

    // 6. 校验手机号
    private static boolean checkPhone(String phone) {
        // 长度为11位
        if (phone.length() != 11) {
            return false;
        }

        // 不能以0为开
        if (phone.startsWith("0")) {
            return false;
        }

        // 必须都是数字
        for (int i = 0; i < 11; i++) {
            char c = phone.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // 检查用户名是否合法
    private static boolean checkUsername(String username) {
        // 1. 判断用户名长度是否在3~15位之间
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度必须在3~15位之间，请重新输入");
            return false;
        }

        // 2. 判断用户名是否是字母加数字的组合，但是不能是纯数字, 可以是纯字母
        // 2.1 定义一个字符串，包含所有的数字
        String num = "0123456789";
        // 2.2 定义一个变量，用来记录数字的个数
        int count = 0;
        // 2.3 遍历用户名，判断每一个字符是否是数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (num.contains(String.valueOf(c))) {
                count++;
            }
        }
        // 2.4 判断数字的个数是否等于用户名的长度
        if (count == username.length()) {
            System.out.println("用户名不能是纯数字，请重新输入");
            return false;
        }

        // 3. 判断用户名只能是字母加数字的组合
        char[] ch = username.toCharArray();
        for (char c : ch) {
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
                System.out.println("用户名只能是字母加数字的组合，请重新输入");
                return false;
            }
        }

        return true;
    }

}
