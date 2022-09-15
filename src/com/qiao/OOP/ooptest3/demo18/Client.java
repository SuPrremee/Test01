package com.qiao.OOP.ooptest3.demo18;

/**
 * @ClassName Client
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/10 5:07 PM
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Car a = new AudiFactor().getCar();
        Car b = new BYDFactor().getCar();
        a.run();
        b.run();
    }
}
interface Car{
    void run();
}

//工厂接口
interface Factor{
    Car getCar();
}

class BYD implements Car{
    public void run(){
        System.out.println("比亚迪");
    }
}

class Audi implements Car{
    public void run(){
        System.out.println("奥迪");
    }
}

class BYDFactor implements Factor{

    @Override
    public BYD getCar() {
        return new BYD();
    }
}

class AudiFactor implements Factor{
    public Audi getCar(){
        return new Audi();
    }
}
