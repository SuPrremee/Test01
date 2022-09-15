package com.qiao.OOP.ooptest.demo32;

/**
 * this关键字的使用
 * 1.this可以用来修饰、调用：属性、方法、构造器
 * 2.this修饰属性和方法
 *   this理解为当前对象
 *
 *   在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。
 *   但是，通常情况下，我们都选择省略"this."。特殊情况下，如果方法的形参和类的属性同名时，
 *   我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 *
 *   在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。
 *   但是，通常情况下，我们都选择省略"this."。特殊情况下，如果构造器的形参和类的属性同名时，
 *   我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *
 *   3.this调用构造器
 *      在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 *      构造器中不能通过"this(形参列表)"方式调用自己
 *      如果一个类中有n个构造器，则最多有n-1个构造器中使用了"this(参数列表)"
 *      规定："this(形参列表)"必须声明在当前构造器的首行
 *
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1);
        System.out.println(p.getAge());
        System.out.println("=================");
        Person p1 = new Person("taojiaobao",20);
    }
}

class Person{
    //属性
    private String name;
    private int age;

    //构造器
    public Person(){
        this.eat();
        String Info = "Person初始化时，需要考虑如下的1，2，3，4......";
        System.out.println(Info);
        //Person初始化时，需要考虑如下的1，2，3，4.....（共40行代码）
    }
    public Person(String name){
        //通过构造器调用对象
        this();
        this.name = name;
        //Person初始化时，需要考虑如下的1，2，3，4.....（共40行代码）
    }

    public Person(int age) {
        this();
        this.age = age;
        //Person初始化时，需要考虑如下的1，2，3，4.....（共40行代码）
    }

    public Person(String name,int age) {
        this(age);
        this.name = name;
        //this.age = age;
        //Person初始化时，需要考虑如下的1，2，3，4.....（共40行代码）
    }

    public void eat(){
        System.out.println("吃饭");
    }

    //get、set方法
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}