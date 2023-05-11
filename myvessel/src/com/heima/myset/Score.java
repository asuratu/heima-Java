package com.heima.myset;

/**
 * @ClassName Score
 * @Description com.heima.myset.Score
 * @Author AsuraTu
 * @Date 2023/5/11 17:47
 * @Version 1.0.0
 */
public class Score implements Comparable<Score> {

    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;
    private int total;

    public Score() {
    }

    public Score(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.total = chinese + math + english;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Score o) {
        // 按照总分从高到低排序
        // 如果总分一样，按照语文成绩排
        // 如果语文一样，按照数学成绩排
        // 如果数学成绩一样，按照英语成绩排
        // 如果英文成绩一样，按照年龄排
        // 如果年龄一样，按照姓名的字母顺序排
        // 如果都一样，认为是同一个学生，不存。

        // 总分
        int total1 = this.chinese + this.math + this.english;
        int total2 = o.chinese + o.math + o.english;
        // 总分不一样，按照总分排序
        if (total1 != total2) {
            return total2 - total1;
        }
        // 总分一样，按照语文成绩排序
        if (this.chinese != o.chinese) {
            return o.chinese - this.chinese;
        }

        // 语文成绩一样，按照数学成绩排序
        if (this.math != o.math) {
            return o.math - this.math;
        }

        // 数学成绩一样，按照英语成绩排序
        if (this.english != o.english) {
            return o.english - this.english;
        }

        // 英语成绩一样，按照年龄排序, 年龄小的在前面
        if (this.age != o.age) {
            return this.age - o.age;
        }

        // 年龄一样，按照姓名的字母顺序排序, 按照字母顺序排
        return this.name.compareTo(o.name);
    }

    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        // 如果地址值相同，直接返回true
        if (this == obj) {
            return true;
        }
        // 如果传递的参数是null，直接返回false
        if (obj == null) {
            return false;
        }
        // 如果传递的参数obj是一个类型，直接返回false
        if (getClass() != obj.getClass()) {
            return false;
        }
        // 向下转型
        Score stu = (Score) obj;
        // 比较两个对象的属性值，一个对象是this（调用者），一个对象是stu（形参）
        return this.name.equals(stu.name) && this.age == stu.age;
    }

    // 重写hashCode方法
    @Override
    public int hashCode() {
        // 重写hashCode方法，返回的哈希值，必须和equals方法中比较的属性一致
        return this.name.hashCode() + this.age;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", total=" + total +
                '}';
    }

}
