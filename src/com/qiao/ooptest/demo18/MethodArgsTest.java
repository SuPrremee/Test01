package com.qiao.ooptest.demo18;

/**
 *可变个数形参的方法
 * 1.jdk 5.0新增的内容
 * 2.具体使用：
 *  2.1 可变个数形参的格式：数据类型...变量
 */
public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(1);
        test.show("taojiabao");
        test.show("tao","jia","bao");
    }

    public void show(int i){
        System.out.println(i);
    }
    public void show(String s){
        System.out.println(s);
    }
    public void show(String...strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
//    public void show (String[] strings){
//
//    }
}
