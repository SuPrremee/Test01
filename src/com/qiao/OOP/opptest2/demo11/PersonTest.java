package com.qiao.OOP.opptest2.demo11;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/4 12:03 AM
 * @Version 1.0
 **/
// 面向对象特征之-----多态性
// 1.理解多态性：可以理解为一个事物的多种形态
// 2.何为多态性：
//              对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
// 3.多态的使用：虚拟方法的调用
//              有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
//              总结：编译看左边的引用 类型；运行看右边的new对象。
// 4.多态性的使用前提：
//              1.类的继承关系
//              2.需要有方法的重写
//
// 5.多态性的好处：
//              有了多态性就可以避免方法的重载
//
// 对于多态，只有等到方法调用的那一刻，解释运行器才会确定所要调用的具体方法，这称为"晚绑定"或"动态绑定"
// instanceof：
//
//
//
//
//
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        /*************************/
        //对象的多态性：父类的引用(p2)指向子类的对象(new Man)
        Person p1 = new Man();
        //调用的是子类重写父类的方法
        p1.eat();
        //多态的使用：当调用子父类同名参数的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        //
        Person p2 = new Woman();
        p2.eat();
        p2.walk();
        System.out.println("****************************************");
        //不能调用子类所特有的方法,编译时p1是Person类型
        //p1.earnMoney();
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
        //编译时只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。

        //如何调用调用子类特有的属性和方法。
        //向下转型：使用强制类型转换符
        Man m1 = (Man) p1;
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强转时，可能出现ClassCastException的异常
        try {
            Woman w1 = (Woman) p1;
            w1.goShopping();
        } catch (ClassCastException e){
            System.out.println("类型强转异常");
        }

        //instanceof关键字的使用
        // a instanceof A ：判断对象a是否是类A的实例。如果是返回true；如果不是返回false


        // 使用情景：为了避免向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行
        // instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型

        //如果a instanceof A返回true，则a instanceof B也返回true。其中类B是类A的父类
        //其中类B是类A的父类
        if (p1 instanceof Woman){
            Woman w = (Woman)p1;
            w.goShopping();
            System.out.println("***********Woman*************");
        }
        if (p1 instanceof Man){
            Man m2 = (Man)p1;
            man.earnMoney();
            System.out.println("***********Man*************");
        }

        if (p1 instanceof Person){
            System.out.println("***********PersonTest*************");
        }

        if (p1 instanceof Object){
            System.out.println("***********Object*************");
        }

        //练习
        //问题一：编译时通过，运行时不通过
//        PersonTest p3= new Woman();
//        Man m3 = (Man)p3;

        //问题二：编译通过，运行时也通过
        Object obj = new Woman();
        Person p4 = (Person) obj;
    }
}
