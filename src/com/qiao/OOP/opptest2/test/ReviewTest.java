package com.qiao.OOP.opptest2.test;

import org.junit.Test;

/**
 * @ClassName ReviewTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/6 5:14 PM
 * @Version 1.0
 **/
public class ReviewTest {

    //关于toString方法
    @Test
    public void test3(){
        String s = "abc";
        s = null;
        System.out.println(s);
        //System.out.println(s.toString());//NullPointerException空指针异常
    }
    //区别手动写和自动生成的equals()
    @Test
    public void test2(){
        Person p = new Person("Tom",12);
        Man m = new Man("Tom",12);
        System.out.println(p.equals(m));
    }
    @Test
    public void test1(){
        //可以认为数组是特殊类继承于Object
        int[] arr = new int[]{1,2,3};
        print(arr[0]);
        System.out.println(arr.getClass().getSuperclass());
    }
    public void print(Object obj){
        System.out.println(obj);
    }
}
