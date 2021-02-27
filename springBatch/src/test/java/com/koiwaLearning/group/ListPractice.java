package com.koiwaLearning.group;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 增加元素
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);

        // 删除元素
        list.remove(2);
        System.out.println(list);

        // 修改元素
        list.set(0, "zz");
        System.out.println(list);
    }

}
