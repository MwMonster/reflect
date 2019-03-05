package com.mw.monster.reflect;

/**
 * @author MwMonster
 * @Classname reflect
 * @Description 通过反射获取对象的三种方式
 * 在运行期间，一个类，只有一个class对象产生
 * @Date 2019/3/5 10:51
 */
public class reflect {

    public static void main(String[] args) {

        // 1.第一种获取class对象
        Student stu1 = new Student();
        Class stuClass = stu1.getClass();
        System.out.println(stuClass.getName());

        // 2.第二种方式获取class对象
        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);

        // 3.第三种方式获取class对象
        try {
            Class stuClass3 = Class.forName("com.mw.monster.reflect.Student");
            System.out.println(stuClass3 == stuClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
