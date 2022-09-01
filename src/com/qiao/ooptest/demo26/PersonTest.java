package com.qiao.ooptest.demo26;

/**
 * 创建程序，在其定义两个类：Person和PersonTest类。
 * 定义如下Person age:int，setAge(int i)，getAge():int
 * 用setAge()设置人的合法年龄(0-130),用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(13);
        System.out.println(b.getAge());
    }
}
