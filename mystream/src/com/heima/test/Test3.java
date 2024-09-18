package com.heima.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName Test1
 * @Description Test1
 * @Author AsuraTu
 * @Date 2024/9/18
 */
public class Test3 {
    public static void main(String[] args) {
        // 初始化男演员集合
        ArrayList<String> maleActors = new ArrayList<>();
        maleActors.add("张三,23");
        maleActors.add("李四,24");
        maleActors.add("王五,25");
        maleActors.add("赵六,26");
        maleActors.add("孙七,27");
        maleActors.add("钱八,28");

        // 初始化女演员集合
        ArrayList<String> femaleActors = new ArrayList<>();
        femaleActors.add("杨颖,22");
        femaleActors.add("赵丽颖,23");
        femaleActors.add("杨幂,24");
        femaleActors.add("杨紫,25");
        femaleActors.add("迪丽热巴,26");
        femaleActors.add("杨洋,27");

        // 1. 男演员中名字为三个字的前两人
        Stream<String> s1 = maleActors.stream()
                // 过滤名字为三个字的
                .filter(s -> s.split(",")[0].length() == 3)
                // 只取前两人
                .limit(2);

        // 2. 女演员中姓杨的，且不要第一个
        Stream<String> s2 = femaleActors.stream()
                // 过滤姓杨的
                .filter(s -> s.startsWith("杨"))
                // 跳过第一个
                .skip(1);

        // 3. 合并男演员和女演员集合
        Stream<String> mergedActors = Stream.concat(s1, s2);

        // 4. 封装成 Actor 对象
        List<Actor> actorList = mergedActors.map(s -> {
                    String[] parts = s.split(",");
                    return new Actor(parts[0], Integer.parseInt(parts[1]));
                })
                .toList();

        // 5. 输出结果
        actorList.forEach(System.out::println);
    }
}
