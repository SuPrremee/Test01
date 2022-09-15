package com.qiao.OOP.opptest2.demo21;

import org.junit.Test;

/**
 * @ClassName WrapperTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 9:57 PM
 * @Version 1.0
 **/
//
// 包装类的使用：
// 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
//
// 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
//
//
//
//
//
public class WrapperTest {

    //String类型--->基本数据类型、包装类：调用包装类的parseXxx()
    @Test
    public void test5(){
        String str1 = "123";
//        int num1 = (int)str1;
//        Integer in1 = (Integer)str1;
        Integer in1 = Integer.parseInt(str1);
        System.out.println(in1 + 1);

        String str2 = "true";
        boolean parseBoolean = Boolean.parseBoolean(str2);
        System.out.println(parseBoolean);
    }

    //基本数据类型、包装了--->String类型:调用String重载的valueOf(xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式一:连接运算
        String str1 = num1 + "";

        //方式二：调用String的valueOf(xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }
    @Test
    public void test3(){
//        int num = 10;
//        //基本数据类型---->包装类的对象
//        Integer in1 = new Integer(num);
//        method(in1);

        //自动装箱：基本数据类型--->包装类
        int num2 = 10;
        Integer in1 = num2;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱
        method(in1);

        //自动拆箱：包装类--->基本数据类型
        int num3 = in1;//自动拆箱

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //包装类---->基本数据类型：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    //基本数据类型---->包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        System.out.println(b1.booleanValue());
        System.out.println(b2.booleanValue());
//        System.out.println(b1.toString());
//        System.out.println(b2.toString());

        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.isFemale);
    }
    
}

class Order{
    boolean isMale;
    Boolean isFemale;
}