package com.heima.mymap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName A01_MapDemo1
 * @Description com.heima.mymap.A01_MapDemo1
 * @Author AsuraTu
 * @Date 2023/5/15 10:54
 * @Version 1.0.0
 */
public class A01_MapDemo1 {
    public static void main(String[] args) {
        // Collection 是单列集合
        // Map 是双列集合

        // Map 集合的特点:
        // 1. Map 集合是一个双列集合, 一个元素包含两个值(一个key, 一个value)
        // 2. Map 集合中的元素, key 和 value 的数据类型可以相同, 也可以不同
        // 3. Map 集合中的元素, key 是不允许重复的, value 是可以重复的
        // 4. Map 集合中的元素, key 和 value 是一一对应的

        // Map 集合的常用方法:
        // 1. V put(K key, V value): 向集合中添加元素
        // 2. V remove(Object key): 根据键删除键值对元素
        // 3. void clear(): 清空集合中的所有元素
        // 4. boolean containsKey(Object key): 判断集合中是否包含指定的键    包含返回true, 不包含返回false
        // 5. boolean containsValue(Object value): 判断集合中是否包含指定的值    包含返回true, 不包含返回false
        // 6. boolean isEmpty(): 判断集合是否为空    为空返回true, 不为空返回false
        // 7. int size(): 集合的长度, 即键值对的个数
        // 8. V get(Object key): 根据键获取值
        // 9. Set<K> keySet(): 获取集合中所有键的集合
        // 10. Collection<V> values(): 获取集合中所有值的集合
        // 11. Set<Map.Entry<K,V>> entrySet(): 将集合中的映射关系存储到Set集合中

        // 1. 创建集合对象
        Map<String, String> map = new HashMap<>();
        // 2. 添加元素
        // 2.1 如果添加的时候, key 重复了, 那么就会使用新的 value 替换掉原有的 value, 返回被替换掉的 value
        // 2.2 如果添加的时候, key 不重复, 那么就会返回 null
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        // 3. 遍历集合
        // 3.1 获取所有的 key, 所有的 key 是一个 Set 集合
        // 3.2 遍历 key 的集合, 获取到每一个 key
        // 3.3 根据 key 获取 value
        printMap(map);

        System.out.println("--------");

        // 4. 根据 key 删除键值对元素
        // 4.1 返回被删除掉的 value
        map.remove("李四");
        printMap(map);

        System.out.println("--------");

        // 5. 清空集合
        map.clear();
        printMap(map);

        System.out.println("--------");

        // 6. 判断集合中是否包含指定的键
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsKey("赵六"));

        System.out.println("--------");

        // 7. 判断集合中是否包含指定的值
        System.out.println(map.containsValue("男"));
        System.out.println(map.containsValue("女"));

        System.out.println("--------");

        // 8. 判断集合是否为空
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

        System.out.println("--------");

        // 9. 获取集合的长度, 即键值对的个数
        System.out.println(map.size());
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        System.out.println(map.size());

        System.out.println("--------");

        // 10. 根据键获取值
        System.out.println(map.get("张三"));
        // 如果集合中没有这个键, 返回 null
        System.out.println(map.get("赵六"));

        System.out.println("--------");

        // 11. 获取集合中所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        System.out.println("--------");

        // 12. 获取集合中所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("--------");


    }


    public static void printMap(Map<String, String> map) {
        // 1. 获取所有的 key, 所有的 key 是一个 Set 集合
        Set<String> keySet = map.keySet();
        // 2. 遍历 key 的集合, 获取到每一个 key
        for (String key : keySet) {
            // 3. 根据 key 获取 value
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

}
