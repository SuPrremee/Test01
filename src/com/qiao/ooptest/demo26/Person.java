package com.qiao.ooptest.demo26;

/**
 * 创建程序，在其定义两个类：Person和PersonTest类。
 * 定义如下Person age:int，setAge(int i)，getAge():int
 * 用setAge()设置人的合法年龄(0-130),用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法。
 */

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        if (Age < 0 || Age > 130){
            //getAge();
            return;
        }else {
            age = Age;
        }
    }
}
