package com.qiao.OOP.opptest2.demo07;

/**
 * @ClassName SuperTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:53 PM
 * @Version 1.0
 **/
//
// super关键字的使用
// 1.super理解为：父类的
// 2.super可以用来调用：属性、方法、构造器
//
// 3.super的使用:调用属性和方法
//      1.我们可以在子类的方法中或构造器中。通过使用"super.属性"或"super.方法"的方式，显式的调用
//      父类中声明的属性或方法。但是，通常情况下，我们习惯省略"super."
//
//      2.特殊情况：当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，必须显式的
//      使用"super.属性"的方式，表明调用的是父类中声明的属性
//      3.特殊情况：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显
//      式的使用"super.方法"的方法，表明调用的是父类中被重写的方法
//
// 4.super调用构造器
//      1.我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
//      2."super(形参列表)"的使用，必须声明在子类构造器的首行
//      3.我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二选一，不能同时出现
//      4.在构造器的首行，没有显式的声明"this.(形参列表)"或"super(形参列表)"。则默认调用的式父类中空参的构造器super()
//      5.在类的多个构造器中，至少有一个类的构造器中使用了"super(形参列表)"，调用父类中的构造器
//
//
//
public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.study();
        Student s1 = new Student("陶家宝",31,"nt");
        s1.show();
        Student s2 = new Student();
    }
}
