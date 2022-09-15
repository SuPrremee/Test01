package com.qiao.OOP.ooptest3.demo09;


/**
 * @ClassName FinalTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 1:40 AM
 * @Version 1.0
 **/
public class FinalTest {
}

class Something1{
    public int addOne(final int x){
//        return ++x;   错
        return x+1;   //对
    }
}

class Something2{
    public static void main(String[] args) {
        Other o = new Other();
        new Something2().addOne(o);
    }
    public void addOne(final Other o){
        //o = new Other();错
        //o.i++;
        System.out.println(o.i++);
    }
}

class Other {
    public int i = 1;
}