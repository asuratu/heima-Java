package com.heima.api;

public class StringDemo9 {
    public static void main(String[] args) {
        // 替换手机号的中间四位
        String phone = "13800138000";
//        String newPhone = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        // 自己定义方法
        String newPhone = replacePhone(phone);
        System.out.println(newPhone);
    }

    private static String replacePhone(String phone) {
        StringBuilder s = new StringBuilder(phone);
        for (int i = 3; i < 7; i++) {
            s.setCharAt(i, '*');
        }
        return s.toString();
    }


}
