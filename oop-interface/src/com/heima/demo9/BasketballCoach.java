package com.heima.demo9;

/**
 * @ClassName BasketballCoach
 * @Description 篮球教练
 * @Author AsuraTu
 * @Date 2024/9/14
 */
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
