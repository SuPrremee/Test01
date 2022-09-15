package com.qiao.OOP.opptest2.demo19;

import java.util.Objects;

/**
 * @ClassName EqualsTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 12:54 PM
 * @Version 1.0
 **/

//
// 面试题：== 和 equals()区别
// 一、回顾 == 的使用：
// ==：运算符
// 1.可以使用在基本数据类型变量和引用数据类型变量中
// 2.如果比较的是基本数据类型变量：比较两个变量保存的的数据是否相等。(不一定类型要相同)
//   如果比较的是引用数据类型变量：比较两个对象的地址值是否相同,即两个引用是否指向同一个对象实体(引用类型变量)
//
// 二、equals()方法的使用
// 1.是一方法，而非运算符
// 2.equals只能够适用于引用数据类型
// 3.Object类中equals()的定义：
// public boolean equals(Object obj) {
//        return (this == obj);
//    }
// Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体(引用类型变量)
//
// 4.像String、Data、File、包装类等都重写；额Object类中的equals()方法，重写以后比较的不是两个引用的地址是否相同
//   而是比较两个对象的"实体类容"是否相同
//
// 5.通常情况下，我们自定义的类如果使用equals()的的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们就需要对
//   Object类中的equals()进行重写
//
//
//
public class EqualsTest {
    public static void main(String[] args) {
//        int i = 10;
//        int j = 10;
//        double d = 10;
//        System.out.println(i == j);
//        System.out.println(i == d);
//
//        boolean b = true;
////        System.out.println(i == b);
//        char c = 10;
//        System.out.println(i == c);
//
//        char c1 = 'A';
//        char c2 = 65;
//        System.out.println(c1 == c2);

        Equals equals1 = new Equals("陶家宝",21);
        Equals equals2 = new Equals("陶家宝",21);
        System.out.println(equals1.equals(equals2));
//        System.out.println(equals == equals1);
//
        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1 == str2);   //比较的是地址
        System.out.println(str1.equals(str2));
    }
}

class Equals{
    String name;
    int age;

    public Equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Equals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写的原则：比较两个对象的实体内容(即name和age)是否相同
//    @Override
//    public boolean equals(Object obj) {
////        System.out.println("这是Equals equals()重写的方法");
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Equals) {
//            Equals equals = (Equals) obj;
//            //比较两个对象的每个属性是否相同
//            return this.age == equals.age && this.name.equals(equals.name);
//        } else {
//            return false;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equals)) return false;
        Equals equals = (Equals) o;
        return getAge() == equals.getAge() && getName().equals(equals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

//    @Override
//    public String toString() {
//        return "Equals[name = " + name + ",age = " + age + "]";
//    }


    @Override
    public String toString() {
        return "Equals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}