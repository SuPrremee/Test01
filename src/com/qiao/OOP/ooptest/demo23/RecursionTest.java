package com.qiao.OOP.ooptest.demo23;

/**
 * 递归
 * 1.递归方法：一个方法体哪调用他自身
 * 2.方法递归包含了一宗隐式的循环，他会重复执行某段代码，但这种重复执行无需循环控制。
 * 递归一定要相一致方向递归，否则这种递归就会变成无穷递归，类似于死循环
 */
public class RecursionTest {
    //计算1-100之间所有自然数的和
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

        System.out.println(test.recursion(100));
        System.out.println(test.recursion1(5));
    }
    public int recursion(int sum){
        if (sum == 1)
            return 1;
        else {
            return sum + recursion(sum-1);
        }

    }
    public int recursion1(int sum){
        if (sum == 1)
            return 1;
        else {
            return sum * recursion1(sum-1);
        }

    }
}
