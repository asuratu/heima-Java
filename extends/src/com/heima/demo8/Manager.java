package com.heima.demo8;

/**
 * @ClassName Manager
 * @Description 经理
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Manager extends Employee {
    // 奖金
    private final double bonus;

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    // 吃饭
    @Override
    public void work() {
        System.out.println("经理正在工作...");
    }

    // 管理奖金
    public void manageBonus() {
        System.out.printf("经理管理奖金%.2f元\n", bonus);
    }

    @Override
    public String toString() {
        return "{" +
                "bonus=" + bonus +
                ", id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }
}
