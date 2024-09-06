package com.heima.test;

public class StudentTest {
    // 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    // 学生的属性：学号，姓名，年龄。
    // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    // 要求2：添加完毕之后，遍历所有学生信息。
    // 要求3：通过id删除学生信息
    // 如果存在，则删除，如果不存在，则提示删除失败。
    // 要求4：删除完毕之后，遍历所有学生信息。
    // 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁，如果不存在，则提示查无此人。
    public static void main(String[] args) {
        // 1. 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        Student[] students = new Student[3];
        students[0] = new Student("heima001", "张三", 188);
        students[1] = new Student("heima002", "李四", 19);
        students[2] = new Student("heima003", "王五", 20);

        // 分割线
        System.out.println("====================================");

        // 2. 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s = new Student("heima004", "赵六", 21);
        students = addStudent(students, s);

        // 3. 遍历所有学生信息。
        printStudent(students);

        // 分割线
        System.out.println("====================================");

        // 4. 通过id删除学生信息
        students = deleteStudent(students, "heima002");

        // 5. 遍历所有学生信息。
        printStudent(students);

        // 分割线
        System.out.println("====================================");

        // 6. 查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁，如果不存在，则提示查无此人。
        updateStudent(students, "heima003");

        // 7. 遍历所有学生信息。
        printStudent(students);

        // 分割线
        System.out.println("====================================");

        addAge(students, "heima001");

        printStudent(students);
    }

    private static void updateStudent(Student[] students, String id) {
        // 1. 判断学号是否存在
        boolean flag = isExist(students, id);

        // 2. 如果学号存在，年龄+1
        if (flag) {
            for (Student student : students) {
                if (student.getId().equals(id)) {
                    student.setAge(student.getAge() + 1);
                    System.out.println("年龄+1成功");
                    break;
                }
            }
        } else {
            System.out.println("查无此人");
        }
    }

    private static Student[] deleteStudent(Student[] students, String id) {
        // 1. 判断学号是否存在
        boolean flag = isExist(students, id);

        // 2. 如果学号存在，删除学生
        if (flag) {
            // 2.1 创建新数组
            Student[] newStudents = new Student[students.length - 1];

            // 2.2 将原数组中的元素复制到新数组中
            for (int i = 0, j = 0; i < students.length; i++) {
                if (!students[i].getId().equals(id)) {
                    newStudents[j++] = students[i];
                }
            }

            System.out.println("删除成功");

            // 2.3 将新数组赋值给原数组
            return newStudents;
        } else {
            System.out.println("学号不存在");
            return students;
        }
    }

    private static void printStudent(Student[] students) {
        for (Student student : students) {
            // 输出学生信息
            System.out.println("学号: " + student.getId() + ", 姓名: " + student.getName() + ", 年龄: " + student.getAge());
        }
    }

    private static Student[] addStudent(Student[] students, Student s) {
        // 1. 判断学号是否存在
        boolean flag = isExist(students, s.getId());

        // 2. 如果学号存在，提示学号已存在
        if (flag) {
            System.out.println("学号已存在");
            return students;
        }

        // 3. 如果学号不存在，添加学生
        // 3.1 创建新数组
        Student[] newStudents = new Student[students.length + 1];

        // 3.2 将原数组中的元素复制到新数组中
        System.arraycopy(students, 0, newStudents, 0, students.length);

        // 3.3 将新学生添加到新数组中
        newStudents[newStudents.length - 1] = s;

        System.out.println("添加成功");

        return newStudents;
    }

    // 判断学号是否存在
    private static boolean isExist(Student[] students, String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private static int search(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    private static void addAge(Student[] students, String id) {
        int i = search(students, id);
        if (i == -1) {
            System.out.println("学号不存在");
            return;
        }
        students[i].setAge(students[i].getAge() + 1);
    }
}
