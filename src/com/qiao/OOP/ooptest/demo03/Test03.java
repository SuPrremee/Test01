package com.qiao.OOP.ooptest.demo03;
//构造方法 编写Java程序模拟简单的计算器。
// 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
// 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。
// 在main方法中创建Number类的对象调用各个方法并显示计算结果。

public class Test03 {
    private int n1;
    private int n2;

    //构造方法
    public Test03(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addition(){
        System.out.println(n1 + n2);
    }

    public void subtration(){
        System.out.println(n1 - n2);
    }

    public void multiplication(){
        System.out.println(n1 * n2);
    }

    public void division(){
        System.out.println(n1 / n2);
    }

}
