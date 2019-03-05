package com.mw.monster.fanxing;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author MwMonster
 * @Classname Demo
 * @Description TODO
 * @Date 2019/3/5 14:51
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

        Class listClass = strList.getClass();
        Method m = listClass.getMethod("add", Object.class);
        m.invoke(strList, 100);

        for (Object obj : strList) {
            System.out.println(obj);

        }
    }
}
