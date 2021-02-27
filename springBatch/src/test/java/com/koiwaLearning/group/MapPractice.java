package com.koiwaLearning.group;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("11", "11");
        map.put("22", "22");
        map.put("33", "33");
        map.put("44", "44");
        map.put("55", "55");

        System.out.println(map.get("22"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        Map<String, String> map2 = new HashMap<>();
        map2.put("77", "77");
        map2.put("88", "88");

        map.putAll(map2);
        System.out.println(map);
    }
}
