public class ValueDemo2 {
    public static void main(String[] args) {
        // \t 制表符, 在打印的时候, 把前面的字符串长度补齐到8的倍数, 最少补一个空格, 最多补8个空格
        System.out.println("name" + "\t" + "Tom");
        System.out.println("namename" + "\t" + "Tom");
        System.out.println("age" + "\t" + "23");
        // \n 换行符, 在打印的时候, 把前面的字符串打印完毕, 然后换行
        System.out.println("gender" + "\t" + "Male" + "\n" + "height" + "\t" + "175");
    }
}