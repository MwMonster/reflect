package com.mw.monster.pro;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author MwMonster
 * @Classname Demo
 * @Description TODO
 * @Date 2019/3/5 14:40
 */
public class Demo {
    public static void main(String[] args) throws Exception{

        Class stuClass = Class.forName(getValue("className"));

        Method m = stuClass.getMethod(getValue("methodName"));

        m.invoke(stuClass.getConstructor().newInstance());

    }

    public static String getValue(String key) throws IOException {
        Properties pro = new Properties();
        FileReader in = new FileReader("pro.txt");
        pro.load(in);
        in.close();
        return pro.getProperty(key);
    }
}
