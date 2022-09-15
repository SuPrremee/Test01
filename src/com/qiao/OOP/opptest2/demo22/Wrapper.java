package com.qiao.OOP.opptest2.demo22;

import org.junit.Test;

/**
 * @ClassName Wrapper
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/6 1:15 AM
 * @Version 1.0
 **/

public class Wrapper {
    @Test
    public void test1(){
        Object obj = true ? new Integer(1) : new Double(2.0);//三元运算符要求表达式一和表达式二类型统一
        System.out.println(obj);
    }
    @Test
    public void test2(){
        Object obj;
        if (true){
            obj = new Integer(1);
        }else {
            obj = new Double(2.0);
        }
        System.out.println(obj);
    }

    @Test
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]
        //保存了从-128～127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128～127范围内时，可以直接使用数组中的元素，不用再去new了。
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
