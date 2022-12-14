package com.qiao.OOP.ooptest3.demo17;

/**
 * @ClassName StaticProxyTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/10 2:13 PM
 * @Version 1.0
 **/

//静态代理
public class StaticProxyTest {
    public static void main(String[] args){
        Star s = new Proxy(new realStar());
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();
    }
}

interface Star {
    void confer();  //面谈

    void signContract();    //签合同

    void bookTicket();  //订票

    void sing();    //唱歌

    void collectMoney();    //收钱
}

class realStar implements Star{

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("歌手唱歌");
    }

    @Override
    public void collectMoney() {

    }
}
class Proxy implements Star{

    private Star real;
    public Proxy(Star real){
        this.real = real;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        real.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}