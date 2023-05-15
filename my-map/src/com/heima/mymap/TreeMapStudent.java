package com.heima.mymap;

/**
 * @ClassName TreeMapStudent
 * @Description com.heima.mymap.TreeMapStudent
 * @Author AsuraTu
 * @Date 2023/5/15 15:14
 * @Version 1.0.0
 */
public class TreeMapStudent implements Comparable<TreeMapStudent> {
    private String name;
    private int age;

    public TreeMapStudent() {
    }

    public TreeMapStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        // 如果地址值相同，直接返回true
        if (this == o) {
            return true;
        }
        // 如果传递的参数是null，直接返回false
        if (o == null) {
            return false;
        }
        // 如果传递的参数obj是一个类型，直接返回false
        if (getClass() != o.getClass()) {
            return false;
        }
        // 向下转型
        TreeMapStudent stu = (TreeMapStudent) o;
        // 比较两个对象的属性值，一个对象是this（调用者），一个对象是stu（形参）
        return this.name.equals(stu.name) && this.age == stu.age;
    }

    // 重写hashCode方法
    @Override
    public int hashCode() {
        return name.hashCode() + age;
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

    @Override
    public int compareTo(TreeMapStudent o) {
        // 按照年龄升序排序
        int num = this.age - o.age;
        // 年龄相同，按照姓名的字母顺序排序
        return num == 0 ? this.name.compareTo(o.name) : num;
    }

    @Override
    public String toString() {
        return "TreeMapStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
