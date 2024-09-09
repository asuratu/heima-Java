package com.heima.test;

// javabean 类, 用来描述事物的类
public class Girlfriend {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    // 计算平均年龄
    public static double getAverageAge(Girlfriend[] girlfriends) {
        if (girlfriends == null || girlfriends.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Girlfriend g : girlfriends) {
            sum += g.getAge();
        }
        return sum / girlfriends.length;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
