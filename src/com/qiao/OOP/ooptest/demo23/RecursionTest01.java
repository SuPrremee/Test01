package com.qiao.OOP.ooptest.demo23;

/**
 * 已知一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
 * f(2) = 2*f(1) + f(0) = 9
 * f(3) = 2*f(2) + f(1) = 12
 *
 */

public class RecursionTest01 {
    public static void main(String[] args) {

        RecursionTest01 test01 = new RecursionTest01();
        System.out.println(test01.recursion(10));
    }

    public int recursion(int n){
        if (n == 0){
            return 1;
        } else if (n == 1){
            return 4;
        } else {
            return 2 * recursion(n-1) + recursion(n-2);
        }
    }
}
