package com.heima.demo;

/**
 * @ClassName Car
 * @Description com.heima.demo.Car
 * @Author AsuraTu
 * @Date 2023/4/21 16:17
 * @Version 1.0.0
 */
public class Car {
    private final int age;
    private final String brand;
    private final String color;
    Engine engine;

    public Car(String brand, String color, int age) {
        this.brand = brand;
        this.color = color;
        this.age = age;
    }

    public void show() {
        // 判断发动机是否为空
        if (engine == null) {
            System.out.println("发动机为空");
            return;
        }
        System.out.println(engine.brand);
        System.out.println(engine.useAge);
        engine.run();
        System.out.println(this.getBrand() + "的汽车在跑");
    }

    public String getBrand() {
        return brand;
    }

    class Engine {
        String brand;
        int useAge;

        public Engine(String brand, int useAge) {
            this.brand = brand;
            this.useAge = useAge;
        }

        void run() {
            System.out.println(brand);
            System.out.println(color);
            System.out.println(age);
            System.out.println("发动机在运行");
        }
    }

}
