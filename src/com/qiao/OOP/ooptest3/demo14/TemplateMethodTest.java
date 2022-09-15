package com.qiao.OOP.ooptest3.demo14;

/**
 * @ClassName TemplateMethodTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 3:22 PM
 * @Version 1.0
 **/
//抽象类的应用：模版方法的设计模式
public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod btm1 = new DrawMoney();
        btm1.process();

        BankTemplateMethod btm2 = new ManageMoney();
        btm2.process();
    }
}

abstract class BankTemplateMethod{
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();    //办理具体的业务//钩子方法
    public void evaluate(){
        System.out.println("反馈评分");
    }

    //模版方法，把基本操作组合到一起，子类一般不能重写
    public final void process() {
        this.takeNumber();

        this.transact();    //像个钩子，具体执行时，挂哪个子类，就执行哪个子类的实现代码

        this.evaluate();
    }
}

class DrawMoney extends  BankTemplateMethod{
    public void transact(){
        System.out.println("取钱");
    }
}
class ManageMoney extends BankTemplateMethod{
    public void transact(){
        System.out.println("理财");
    }
}