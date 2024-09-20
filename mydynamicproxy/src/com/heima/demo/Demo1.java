package com.heima.demo;

/**
 * @ClassName Demo1
 * @Description Demo1
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class Demo1 {
    public static void main(String[] args) {

        StarInterface asura = ProxyUtil.getProxy(new Star("Asura"));
        String singRes = asura.sing("I'm Asura");
        System.out.println(singRes);
        asura.dance();

    }
}
