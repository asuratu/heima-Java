package com.heima.api;

public class StringDemo10 {
    public static void main(String[] args) {
        // 身份证信息提取
        String id = "110101199001011234";
        System.out.println("身份证号: " + id);
        // 截取出生年月日
        String birthday = id.substring(6, 14);
        // 输出格式: 1990年01月01日
        System.out.println(birthday.substring(0, 4) + "年" + birthday.substring(4, 6) + "月" + birthday.substring(6) + "日");
        // 获取性别, 第17位, 0男1女
        int gender = Integer.parseInt(id.substring(16, 17));
        String sex = gender % 2 == 0 ? "女" : "男";
        // 输出格式: 男
        System.out.println("性别: " + sex);
    }
}
