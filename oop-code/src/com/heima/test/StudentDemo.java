package com.heima.test;

public class StudentDemo {
    private String id;
    private String name;
    private int age;

    public StudentDemo() {
    }

    public StudentDemo(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 新增学生
    public static void add(StudentDemo[] students, StudentDemo studentDemo) {
        if (students == null || studentDemo == null) {
            return;
        }

        // 判断学号是否已存在
        if (StudentDemo.checkId(students, studentDemo.getId())) {
            System.out.println("学号已存在");
            return;
        }

        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            // 数组已满，无法新增
            System.out.println("数组已满，无法新增");
            return;
        }
        students[index] = studentDemo;
    }

    // 判断学号是否已存在
    public static boolean checkId(StudentDemo[] students, String id) {
        for (StudentDemo student : students) {
            if (student != null && student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // 根据 id 删除学生
    public static void deleteById(StudentDemo[] students, String id) {
        if (students == null || id == null) {
            return;
        }
        if (!checkId(students, id)) {
            System.out.println("学号不存在");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                students[i] = null;
                break;
            }
        }
    }

    public static void findById(StudentDemo[] students, String id) {
        if (students == null || id == null) {
            return;
        }
        for (StudentDemo student : students) {
            if (student != null && student.getId().equals(id)) {
                System.out.println(student);
                int age = student.getAge();
                student.setAge(age + 1); // 这里由于 student 和 数组 都是引用类型, 所以直接修改 student 就行
                return;
            }
        }
        System.out.println("学号不存在");
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
