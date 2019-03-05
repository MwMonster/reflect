package com.mw.monster.main;

import java.lang.reflect.Method;

/**
 * @author MwMonster
 * @Classname Main
 * @Description TODO
 * @Date 2019/3/5 14:35
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.mw.monster.main.Student");
            Method methodMain = clazz.getMethod("main",String[].class);

            methodMain.invoke(null,(Object)new String[]{"a","b","c"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
