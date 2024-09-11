package com.heima.demo8;

/**
 * @ClassName Chef
 * @Description 厨师
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Chef extends Employee {
    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在做饭...");
    }
}
