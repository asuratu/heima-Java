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

    private static String replacePhone1(String phone) {
        StringBuilder s = new StringBuilder(phone);
        for (int i = 3; i < 7; i++) {
            s.setCharAt(i, '*');
        }
        return s.toString();
    }

    private static String replacePhone2(String phone) {
        StringBuilder s = new StringBuilder(phone);
        s.replace(3, 7, "****");
        return s.toString();
    }

    // 使用substring
    private static String replacePhone(String phone) {
        // q: substring 的用法
        // a: substring(int beginIndex, int endIndex)
        String s1 = phone.substring(0, 3);
        String s2 = phone.substring(7);
        return s1 + "****" + s2;
    }

}
