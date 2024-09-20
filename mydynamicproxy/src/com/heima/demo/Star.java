package com.heima.demo;

/**
 * @ClassName Star
 * @Description 明星类
 * @Author AsuraTu
 * @Date 2024/9/20
 */
public class Star implements StarInterface {
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    @Override
    public String sing(String song) {
        System.out.println(name + "正在唱歌..." + song);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(name + "正在跳舞...");
    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Star{name = " + name + "}";
    }
}
