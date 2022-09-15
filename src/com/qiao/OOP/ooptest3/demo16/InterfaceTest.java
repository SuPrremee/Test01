package com.qiao.OOP.ooptest3.demo16;

//
// 接口的使用
// 1.接口使用interface来定义
// 2.Java中接口和类是并列的两个结构
// 3. 如何定义接口：定义接口中的成员
//      3.1 JDK7以前：只能定义全局常量和抽象方法
//            > 全局常量：public static final的书写时可以省略但是还在
//            > 抽象方法：public abstract的
//
//      3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（）
//            >
//
//
// 4. 接口中不能定义构造器，意味着接口不可以实例化，导致子类对象实例化的时候接口的参与度很低
// 5. 抽象类也不可以实例化，但是抽象类有构造器，抽象类的构造器是为了让子类实例化new的
// 6. Java开发中，接口都通过让去类实现（implements）的方法来实现
//     如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
//     如果实现类覆盖了接口中的所有抽象方法，则实现类仍为一个抽象类
//
// 7. Java类可以实现多个接口 ----> 弥补了Java单继承性的局限性
//      格式：class AA extends BB implements CC,DD,EE{}
//
// 8. 接口和类之间的关系：实现
//     类和类之间的关系：继承
//     接口和接口之间的关系：接口之间可以多继承
//
// //////////////////////////////////////////////////////////////////////////////////////////
// 9. 接口具体使用，体现多态性
// 10. 接口实际上可以看作是一种规范
//
// 抽象类与接口有哪些异同？
// 相同：都是关键字，都不可以实例化
// 不同：抽象类
//
//
//



public interface InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane p = new Plane();
        p.fly();
        p.stop();
    }
}


interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;   //第一宇宙速度
    public static final int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();
}

interface AttackAble{
    void attack();
}

class Plane implements  Flyable{

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void stop() {
        System.out.println("停");
    }
}
abstract class Kite implements  Flyable{

    @Override
    public void fly() {
        System.out.println("风筝飞");
    }
}

class Bullet extends Object implements Flyable,AttackAble,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {
        System.out.println("攻击");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//********************************************************//
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}
