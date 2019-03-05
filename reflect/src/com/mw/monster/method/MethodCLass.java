package com.mw.monster.method;

import java.lang.reflect.Method;

/**
 * @author MwMonster
 * @Classname MethodCLass
 * @Description TODO
 * @Date 2019/3/5 14:25
 */
public class MethodCLass {
    public static void main(String[] args) throws Exception{
        //获取Class对象
        Class stuClass = Class.forName("com.mw.monster.method.Student");

        System.out.println("********************获取所有的公有方法*********************");
        Method[] methodArray = stuClass.getMethods();
        for (Method m: methodArray) {
            System.out.println(m);
        }

        System.out.println("******************获取所有的方法，包括私有的*******************");
        methodArray = stuClass.getDeclaredMethods();
        for (Method m: methodArray) {
            System.out.println(m);
        }

        System.out.println("*****************获取公有的show1()方法**************************");
        Method m = stuClass.getMethod("show1",String.class);
        System.out.println(m);
        Object obj = stuClass.getConstructor().newInstance();
        m.invoke(obj,"刘德华");

        System.out.println("********************获取私有的show4()方法*************************");
        m = stuClass.getDeclaredMethod("show4",int.class);
        System.out.println(m);
        m.setAccessible(true);
        Object result = m.invoke(obj, 20);
        System.out.println("返回值：" + result);

    }
}
