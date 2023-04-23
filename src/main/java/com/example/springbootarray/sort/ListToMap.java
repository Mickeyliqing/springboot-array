package com.example.springbootarray.sort;

import com.example.springbootarray.model.User;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        User user1 = new User("AA", 01);
        User user2 = new User("BB", 02);
        User user3 = new User("CC", 03);
        User user4 = new User("DD", 03);

        List<User> list = Lists.newArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        /**
         * 将 List 转 Map，第一种写法
         */
       /* Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(s -> s.getAge(), s -> s.getName()));
        System.out.println(map1);*/

        /**
         * 将 List 转 Map，第二种写法
         */
       /* Map<Integer, String> map2 = list.stream().collect(Collectors.toMap(User::getAge, User::getName));
        System.out.println(map2);*/

        /**
         * 将 List 转 Map，如果 key 重复，那么取第二个 key 对应的 value
         */
     /*   Map<Integer, String> map3 = list.stream().collect(Collectors.toMap(User::getAge, User::getName, (key1, key2) -> key2));
        System.out.println(map3);*/

        /**
         * 将 List 转 Map，如果 key 重复，那么取第二个 key 对应的 value, value 为 User 对象
         */
       /* Map<Integer, Object> map4 = list.stream().collect(Collectors.toMap(User::getAge, user -> user, (key1, key2) -> key2));
        System.out.println(map4);*/

        /**
         * 将 List 转 Map，如果 key 重复，那么取第二个 key 对应的 value, value 为 User 对象
         */
      /*  Map<Integer, Object> map5 = list.stream().collect(Collectors.toMap(User::getAge, Function.identity(), (key1, key2) -> key2));
        System.out.println(map5);*/

        /**
         * 将 List 转 Map，如果 key 重复，那么把重复的数据放到一个 List 内, value 为 User 对象
         */
        Map<Integer, List<User>> map6 = list.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(map6);

        /**
         * 将 List 转 Map，如果 key 重复，那么把重复的数据放到一个 List 内, value 为 name
         */
        Map<Integer, List<String>> map7 = list.stream().collect(Collectors.groupingBy(User::getAge, Collectors.mapping(User::getName, Collectors.toList())));
        System.out.println(map7);

    }
}
