package com.heima.demo;

/**
 * @ClassName GirlFriend
 * @Description GirlFriend
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 限制 3 - 10 个字
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException("姓名长度必须在3-10个字之间");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 限制为 1 - 100 的字符
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("年龄必须在1-100之间");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
