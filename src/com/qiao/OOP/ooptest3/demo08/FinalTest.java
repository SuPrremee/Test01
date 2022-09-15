package com.qiao.OOP.ooptest3.demo08;


/**
 * @ClassName FinalTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 1:01 AM
 * @Version 1.0
 **/

//
// final:最终的
// 1. final可以用来修饰的结构：类、方法、变量
//
// 2. final 用来修饰一个类：此类不能被其他类所继承
//              比如：String类、System类、StringBuffer类
//
// 3. final 用来修饰方法：表示此方法不可以被重写
//              比如：Object类中getClass();
//
// 4. final 用来修饰变量：此时的"变量"就称为是一个常量
//      4.1 final修饰属性：可以考虑赋值的位置：显示初始化、代码块中初始化、构造器中初始化
//      4.2 final用来修饰局部变量:
//                                  尤其是使用final修饰形参时，表明形参是一个常量。当我们调用此方法是，给常量形参赋实参
//                                  以后，就只能在方法体内使用此形参，但不能进行重新赋值
// static final 用来修饰属性：全局常量；用来修饰方法：直接通过类调用，不能被重写
//
//
public class FinalTest {
    final int WIDTH = 10;
    final  int LEFT;
    final int RIGHT;

//    final int DOWN;
//
//    public void setDOWN(int down){
//        this.DOWN = down;
//    }

    public FinalTest(){
        RIGHT = 10;
    }

    public FinalTest(int n){
        RIGHT = 10;
    }

    {
        LEFT = 10;
    }
    public void doWidth(){
//        width = 20;
    }

    public void show(){
        final int NUM = 10; //常量
//        NUM += 20;
    }

    public void show(final int num){
//        num = 20;
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;
        num = num + 5;

        FinalTest test = new FinalTest();
//        test.setDOWN(10);
        test.show(10);
    }
}
final class FinalA{

}

//class B extends  FinalA{
//
//}

//class C extends String{
//
//}

class AA{
    public final void show(){

    }
}

class BB extends  AA{
//    public void show(){
//
//    }
}