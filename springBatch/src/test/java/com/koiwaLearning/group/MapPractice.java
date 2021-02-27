package com.koiwaLearning.group;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("11", "11");
//        map.put("22", "22");
//        map.put("33", "33");
//        map.put("44", "44");
//        map.put("55", "55");
//
//        System.out.println(map.get("22"));
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//
//        Map<String, String> map2 = new HashMap<>();
//        map2.put("77", "77");
//        map2.put("88", "88");
//
//        map.putAll(map2);
//        System.out.println(map);
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",15);
        map.put("李四",20);
        map.put("王二麻子",25);
        System.out.println("---------map遍历第一种");
        Set<String> keysets = map.keySet();
        for(String next : keysets){
            System.out.print("Key:"+next+" ");
            System.out.println("Values:"+map.get(next));
        }
        System.out.println("--------第二种");
        Set<Map.Entry<String,Integer>> entryies = map.entrySet();
        for(Map.Entry<String,Integer> next :entryies){
            System.out.print("Key:"+next.getKey()+"  ");
            System.out.println("Values:"+next.getValue());
        }
        if(map.isEmpty()){
            System.out.println("这是空的");
        }else {
            System.out.println("有 "+map.size());
        }
        if(map.containsKey("王二麻子")){
            map.put("王二麻子",57);
            System.out.println(map.get("王二麻子"));
        }




    }
}
