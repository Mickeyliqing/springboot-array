package com.example.springbootarray.tools;

import com.example.springbootarray.model.User;

import java.util.Objects;

public class ObjectsTools {
    /**
     * Objects 常用来对象的操作，这里引用的是 java.util 下
     */
    public static void main(String[] args) {
        User user = new User();
        if (Objects.nonNull(user)) {
            System.out.println("AA");
        }
    }
}
