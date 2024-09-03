package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @ClassName A02_Test3
 * @Description com.heima.collections.A02_Test3
 * @Author AsuraTu
 * @Date 2023/5/16 09:21
 * @Version 1.0.0
 */
public class A02_Test3 {
    public static void main(String[] args) {
        // 定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        // 例如：河北省----石家庄市、保定市、邯郸市；湖北省----武汉市、黄冈市、十堰市

        // 默认使用 HashMap
        // 如果要保证存储和取出的顺序一致, 可以使用 LinkedHashMap
        // 如果要排序, 可以使用 TreeMap
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> cityList = new ArrayList<>();
        Collections.addAll(cityList, "石家庄市", "保定市", "邯郸市");
        map.put("河北省", cityList);

        ArrayList<String> cityList2 = new ArrayList<>();
        Collections.addAll(cityList2, "武汉市", "黄冈市", "十堰市");
        map.put("湖北省", cityList2);

        // 输出格式: 河北省----石家庄市、保定市、邯郸市；湖北省----武汉市、黄冈市、十堰市
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            sb.append(key).append("----");
            ArrayList<String> value = map.get(key);
            for (int i = 0; i < value.size(); i++) {
                if (i == value.size() - 1) {
                    sb.append(value.get(i));
                } else {
                    sb.append(value.get(i)).append("、");
                }
            }
            sb.append("；\n");
        }
        System.out.println(sb); // 河北省----石家庄市、保定市、邯郸市；湖北省----武汉市、黄冈市、十堰市

    }
}
