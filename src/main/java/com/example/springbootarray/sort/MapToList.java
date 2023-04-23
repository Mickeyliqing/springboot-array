package com.example.springbootarray.sort;

import com.example.springbootarray.model.User;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(01, "AA");
        map.put(02, "BB");
        map.put(03, "CC");
        map.put(04, "CC");

        /**
         * 将 Map 中的 Value 转化成 List
         */
        List<String> list1 = map.values().stream().collect(Collectors.toList());
        System.out.println(list1);

        /**
         * 将 Map 转化成 List 对应的 List 值为 1=AA
         */
        List<Map.Entry<Integer, String>> list2 = map.entrySet().stream().collect(Collectors.toList());
        System.out.println(list2);

        /**
         * 将 Map 转化成 List 对应的 List 值为 User(name=AA, age=1)
         */
        List<User> list3 = map.entrySet().stream().sorted(Comparator.comparing(s -> s.getValue())).map(s -> new User(s.getValue(), s.getKey())).collect(Collectors.toList());
        System.out.println(list3);

        /**
         * 将 Map 转化成 List 对应的 List 值为 User(name=AA, age=1)
         */
        List<User> list4 = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(s -> new User(s.getValue(), s.getKey())).collect(Collectors.toList());
        System.out.println(list4);

        /**
         * 将 Map 转化成 List 对应的 List 值为 User(name=AA, age=1)
         */
        List<User> list5 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(s -> new User(s.getValue(), s.getKey())).collect(Collectors.toList());
        System.out.println(list5);
    }
}
