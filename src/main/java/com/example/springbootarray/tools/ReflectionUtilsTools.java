package com.example.springbootarray.tools;

import com.example.springbootarray.model.User;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

public class ReflectionUtilsTools {
    /**
     * org.springframework.util 包下面 ReflectionUtils 对象反射封装的方法
     * @param args
     */
    public static void main(String[] args) {
        Field field = ReflectionUtils.findField(User.class, "name");
        System.out.println(field);
    }
}
