package com.heima.demo8;

/**
 * @ClassName Employee
 * @Description 员工
 * @Author AsuraTu
 * @Date 2024/9/11
 */
public class Employee {
    // 员工编号
    private String id;
    // 员工姓名
    private String name;
    // 工资
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 吃饭
    public void eat() {
        System.out.println(name + "正在吃饭...");
    }

    // 工作
    public void work() {
        System.out.println(name + "正在工作...");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
