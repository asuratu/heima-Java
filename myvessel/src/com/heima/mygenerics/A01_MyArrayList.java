package com.heima.mygenerics;

/**
 * @ClassName A01_MyArrayList
 * @Description com.heima.mygenerics.A01_MyArrayList
 * @Author AsuraTu
 * @Date 2023/5/9 13:33
 * @Version 1.0.0
 */
public class A01_MyArrayList<E> {
    // 编写一个类的时候, 如果有属性不确定类型, 那么这个类就可以设置为泛型类
    // 泛型类的格式: 类名<E>
    // E: Element 元素

    // 1. 创建一个Object类型的数组, 用来存储数据
    private Object[] arr = new Object[10];
    // 2. 定义一个变量, 用来记录数组中的元素个数
    private int size;

    // 3. 提供一个方法, 用来向数组中添加元素
    public void add(E e) {
        // 3.1 判断数组中的元素个数是否已经达到数组的最大容量
        if (size == arr.length) {
            // 数组已经满了, 需要扩容
            // 3.2 创建一个新的数组, 长度是原数组的2倍
            Object[] newArr = new Object[arr.length * 2];
            // 3.3 将原数组中的元素复制到新数组中
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            // 3.4 将新数组赋值给原数组
            arr = newArr;
        }
        // 3.5 将元素添加到数组中
        arr[size] = e;
        // 3.6 元素个数+1
        size++;
    }

    // 4. 提供一个方法, 用来获取数组中的元素
    public E get(int index) {
        // 4.1 判断index是否合法
        if (index < 0 || index >= size) {
            throw new RuntimeException("索引不合法: " + index);
        }
        // 4.2 根据索引获取元素
        return (E) arr[index];
    }

    // 5. 重写toString方法
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // 遍历数组
        for (int i = 0; i < size; i++) {
            // 判断是否是最后一个元素
            if (i == size - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
