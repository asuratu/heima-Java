package com.heima.demo3;

/**
 * @ClassName BasketballCoach
 * @Description com.heima.demo3.BasketballCoach
 * @Author AsuraTu
 * @Date 2023/4/20 16:16
 * @Version 1.0.0
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("教打篮球");
    }
}
