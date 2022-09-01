package com.qiao.ooptest.demo10;

public class Test10 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student Info = new Student();
        Info.say();
        System.out.println("姓名： " + Info.name + "\n年龄： " + Info.age + "\n主修： " + Info.major + "\n兴趣： " + Info.intersts);
        teacher.say();
    }
}
