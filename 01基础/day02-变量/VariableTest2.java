public class VariableTest2 {
    public static void main(String[] args) {
        String name = "张三";
        int age = 18;
        double height = 1.75;
        char gender = '男';
        boolean single = true;
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("性别: " + gender);
        System.out.println("单身: " + single);

        // 调用类 VariableTest2 中的方法 printElements
        // 如果 printElements 不是静态方法，则需要实例化对象，并调用方法
        VariableTest2.printElements(name, age, height, gender, single);
        // 方法引用, 一般用户函数式编程, 作为函数参数传递, 延迟执行
        VariableTest2::printElements(name, age, height, gender, single);
    }

    @SafeVarargs
    public static <T> void printElements(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
