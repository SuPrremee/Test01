package com.qiao.OOP.opptest2.test;

import org.junit.Test;

/**
 * @ClassName JunitTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 6:28 PM
 * @Version 1.0
 **/

// Java中的Junit单元测试
// 步骤：1.给方法添加@Test注解
//      2.给Junit添加依赖环境（Add 'JUnit4' to classpath）
//
//
//
//
//
//
//
public class JunitTest {
    int num = 10;
    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        System.out.println(num);
    }
    public void show(){
        num = 20;
        System.out.println("show()....");
    }
    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}
