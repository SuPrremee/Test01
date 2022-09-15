package com.qiao.Exception.demo09;

/**
 * @ClassName ExceptionTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/15 10:19 PM
 * @Version 1.0
 **/
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        methodB();
    }
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }
    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("用B方法的finally");
        }
    }
}

class ReturnExceptionDemo{
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }
    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("用B方法的finally");
        }
    }
}