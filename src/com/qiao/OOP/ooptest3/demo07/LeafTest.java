package com.qiao.OOP.ooptest3.demo07;

/**
 * @ClassName LeafTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 12:33 AM
 * @Version 1.0
 **/

//总结：由父及子，静态先行
class Root{
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root() {
        System.out.println("Root的无参构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid() {
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg) {
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值：" + msg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("leaf的普通代码块");
    }
    public Leaf() {
        //通过super调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
