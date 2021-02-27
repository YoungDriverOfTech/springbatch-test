package com.koiwaLearning.group;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        // 增加元素
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        System.out.println(list);
//
//        // 删除元素
//        list.remove(2);
//        System.out.println(list);
//
//        // 修改元素
//        list.set(0, "zz");
//        System.out.println(list);
        List<Integer> list = new LinkedList<>();
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");
        list.remove(1);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----");
        list.set(1,4455);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------");
        if(list.isEmpty()){
            System.out.println("list是空的");
        }else{
            System.out.println("list不是空的");
        }
        System.out.println("----");
        if(list.size() > 5){
            System.out.println("哈哈哈");
        }else{
            System.out.println("123");
        }
        if(list.contains(33)){
            System.out.println("包含33");
        }
        if(list.contains(66)){
            System.out.println("包含66");
        }
        if(list.contains(33) || list.contains(66) || list.contains(4455)){
            System.out.println("狠狠哈衣");
        }
        System.out.println("------");
        if(list.size() == 3 && !list.contains(78)){
            System.out.println("cuowu");
        }
        System.out.println("---------");
        List<Integer> list1 = new LinkedList<>();
        list1.add(99);
        list1.add(100);
        if(list.size() > 2){
            list.addAll(list1);
            System.out.println(list);
        }
    }

}
