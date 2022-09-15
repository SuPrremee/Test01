package com.qiao.OOP.ooptest.demo11;
//要求创建Person类的对象，设置该对象的name、age、sex属性。
//调用study方法输出字符串"studying"
//调用showAge()方法显示age值
// 调用addAge()方法给对象的age属性值增加2岁
public class Person {
    String name;
    int age;
    boolean isMale;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        return age += i;
    }
}
