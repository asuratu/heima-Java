public class VariableTest {
    public static void main(String[] args) {
        //一开始没有乘客。
        int count = 0;
        //第一站：上去一位乘客
        count += 1;
        //第二站：上去两位乘客，下来一位乘客
        count += 2;
        //第三站：上去两位乘客，下来一位乘客
        count += 2;
        count -= 1;
        //第四站：下来一位乘客
        count -= 1;
        //第五站：上去一位乘客
        count += 1;
        //请问：到了终点站，车上一共几位乘客。
        System.out.println("到了终点站，车上一共" + count + "位乘客。");
    }
}