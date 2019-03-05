package com.mw.monster.field;

import java.lang.reflect.Field;

/**
 * @author MwMonster
 * @Classname Fields
 * @Description TODO
 * @Date 2019/3/5 14:03
 */
public class Fields {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class stuClass = Class.forName("com.mw.monster.field.Student");

        System.out.println("*****************获取所有公有的字段*********************");
        Field[] fieldArray = stuClass.getFields();
        for (Field f : fieldArray) {
            System.out.println(f);
        }

        System.out.println("**********************获取所有的字段（包括私有、受保护、默认的）**************************");
        fieldArray = stuClass.getDeclaredFields();
        for (Field f : fieldArray) {
            System.out.println(f);
        }

        System.out.println("**********************获取公有字段并调用***************************");
        Field f = stuClass.getField("name");
        System.out.println(f);

        Object obj = stuClass.getConstructor().newInstance();
        f.set(obj,"刘德华");

        Student stu = (Student)obj;
        System.out.println("验证姓名： " + stu.name);

        System.out.println("**********************获取私有字段、并调用******************************");
        f = stuClass.getDeclaredField("phoneNum");
        System.out.println(f);
        f.setAccessible(true);
        f.set(obj, "154545454515");
        System.out.println("验证电话： " + stu);

    }
}
