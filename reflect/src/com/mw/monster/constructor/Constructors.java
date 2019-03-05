package com.mw.monster.constructor;

import java.lang.reflect.Constructor;

/**
 * @author MwMonster
 * @Classname Constructors
 * @Description 获取构造方法
 * @Date 2019/3/5 11:16
 */
public class Constructors {
    /**
     * 1.获取构造方法：
     *  1)批量的方法：
     *      public Constructor[] getConstructors():所有“公有的”构造方法
     *      public Constructor[] getDeclaredConstructors():获取所有的构造方法(包括私有、受保护、默认、公有)
     *   2)获取单个的方法，并调用：
     *      public Constructor getConstructor(Class... parmeterTypes):获取单个的“公有的”构造方法;
     *      public Constructor getDeclaredConstructor(Class...parameterTypes):获取“某个构造方法”可以是私有的，或受保护、默认、公有;
     * 2.调用构造方法
     *      Constructor --> newInstance(Object...initargs)
     *      newInstance是Constructor类的方法(管理构造函数的类)
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("com.mw.monster.constructor.Student");

        //1.获取所有公有构造方法
        System.out.println("****************所有公有构造方法****************");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("******************所有构造方法(包括私有、受保护、默认、公有)*************************");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("********************获取公有、无参的构造方法**************************");
        Constructor con = clazz.getConstructor(null);
        System.out.println("con = " + con);

        Object obj = con.newInstance();
        System.out.println("obj = " + obj);

        System.out.println("*************************获取私有构造方法、并调用*****************************");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);
        obj = con.newInstance('男');
    }
}
