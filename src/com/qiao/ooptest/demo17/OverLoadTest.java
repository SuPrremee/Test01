package com.qiao.ooptest.demo17;

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();

    }

    //如下4个方法构成了重载
    public void getSum(int i,int j){
        System.out.println(i+j);
    }

    public void getSum(double d1,double d2){

    }

    public void getSum(String s,int i){

    }

    public void getSum(int i,String s){

    }
}
