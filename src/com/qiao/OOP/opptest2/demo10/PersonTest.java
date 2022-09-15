package com.qiao.OOP.opptest2.demo10;

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
//
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


    }
}
