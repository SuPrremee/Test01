package com.qiao.OOP.ooptest.demo23;

/**
 * 已知一个数列：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n)
 * 其中n是大于0的整数，求f(10)的值。
 */

public class RecursionTest02 {
    public static void main(String[] args) {
        RecursionTest02 test02 = new RecursionTest02();
        System.out.println(test02.recursion(10));
    }
    public int recursion(int n){
        if (n == 20){
            return 1;
        }else if (n == 21){
            return 4;
        }else {
            return recursion(n+2) - 2 * recursion(n+1);
        }
    }
}
