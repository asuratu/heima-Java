package com.heima.test;

// javabean 类, 用来描述事物的类
public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend girlfriend1 = new Girlfriend("小红", 20, "女", "swimming");
        Girlfriend girlfriend2 = new Girlfriend("小黄", 25, "女", "reading");
        Girlfriend girlfriend3 = new Girlfriend("小紫", 30, "女", "dancing");
        Girlfriend girlfriend4 = new Girlfriend("小绿", 35, "女", "singing");

        // 计算四个女朋友的平均年龄
        Girlfriend[] arr = {girlfriend1, girlfriend2, girlfriend3, girlfriend4};
        double averageAge = Girlfriend.getAverageAge(arr);
        System.out.println("平均年龄：" + averageAge);

        System.out.println("--------------------------");

        // 统计比平均年龄小的女朋友的数量, 并且打印她们的信息
        int count = 0;
        for (Girlfriend g : arr) {
            if (g.getAge() < averageAge) {
                count++;
                System.out.println(g.getName() + " " + g.getAge() + " " + g.getGender() + " " + g.getHobby());
            }
        }
        System.out.println("比平均年龄小的女朋友数量：" + count);


    }
}
