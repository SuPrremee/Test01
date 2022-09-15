package com.qiao.OOP.ooptest3.demo25;

/**
 * @ClassName InnerClassTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/14 3:59 PM
 * @Version 1.0
 **/
public class InnerClassTest {

    

    /**
     *  在局部内部类的方法中(show)如果调用局部内部类所声明的方法(比如：method)中的局部变量的话，
     *  要求此局部变量声明为final
     *
     *  jdk7及之前版本：要求此局部变量显式声明为final
     *  jdk8及之后的版本：可以省略final的声明
     */
    public void method(){
        int num = 10;
         class AA{
             public void show(){
                 //num = 20;
                 System.out.println(num);
             }
         }
    }
}
