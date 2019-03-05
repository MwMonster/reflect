package com.mw.monster.field;

/**
 * @author MwMonster
 * @Classname Student
 * @Description TODO
 * @Date 2019/3/5 13:58
 */
public class Student {
    public Student(){

    }

    public String name;

    protected int age;

    char sex;

    private String phoneNum;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
