package com.heima.practice;

public class Test1 {
    public static void main(String[] args) {
        // 卖飞机票
        // 需求：
        // 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        // 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

        // 原价
        double originalPrice = 1000;
        // 月份
        int month = 10;
        // 是否是头等舱
        boolean isFirstClass = false;

        // 1. 计算机票价格
        double ticketPrice = getTicketPrice(originalPrice, month, isFirstClass);
        // 2. 打印结果
        System.out.println("ticketPrice = " + ticketPrice);
    }


    // 定义一个方法, 用来判断是否是旺季
    public static boolean isPeakSeason(int month) {
        return month >= 5 && month <= 10;
    }

    // 定义一个方法, 用来计算机票价格
    public static double getTicketPrice(double originalPrice, int month, boolean isFirstClass) {
        double discount;
        // 1. 判断是否是旺季
        if (isPeakSeason(month)) {
            discount = getDiscount(isFirstClass, 0.9, 0.85);
        } else {
            discount = getDiscount(isFirstClass, 0.7, 0.65);
        }

        return originalPrice * discount;
    }

    // 获取折扣
    public static double getDiscount(boolean isFirstClass, double v1, double v2) {
        return isFirstClass ? v1 : v2;
    }
}
