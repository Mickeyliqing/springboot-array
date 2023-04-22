package com.example.springbootarray.sort;

import com.example.springbootarray.model.User;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        User user1 = new User("AA", 03);
        User user2 = new User("BB", 02);
        User user3 = new User(null, null);

        List<User> list = Lists.newArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(list);

        // 根据 age 升序排列
        // list.sort((s1, s2) -> s1.getAge().compareTo(s2.getAge()));

        // 根据 age 降序排列
        //  list.sort((s1, s2) -> s2.getAge().compareTo(s1.getAge()));

        // 根据 age 升序排列
        // list.sort(Comparator.comparing(User::getAge));

        // 如果 age 相等，那么根据 name 排序
        // list.sort(Comparator.comparing(User::getAge).thenComparing(User::getName));

        // 引入 JAVA 流
        // List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());

        // 降序排列
        //  list.sort(Comparator.comparing(User::getAge).reversed());

        // 降序排列
        //   List<User> collect = list.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());

        // 根据 age 升序排序，并把元素为空的放到队尾，第一层的 Comparator.nullsLast 是判断元素是否为 null, 第二层的 Comparator.nullsLast 是判断元素条件是否为空
        //  list.sort(Comparator.nullsLast(Comparator.comparing(User::getAge, Comparator.nullsLast(Integer::compareTo))));

        // 根据 name 升序排序，并把元素为空的放到队尾，第一层的 Comparator.nullsLast 是判断元素是否为 null, 第二层的 Comparator.nullsLast 是判断元素条件是否为空
        // 如果 name 为 “”，那么对应的元素位置会被放到第一位
        list.sort(Comparator.nullsLast(Comparator.comparing(User::getName, Comparator.nullsLast(String::compareTo))));

        System.out.println(list);

    }
}
