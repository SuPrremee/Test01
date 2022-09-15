package com.qiao.OOP.ooptest.demo23;

/**
 * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
 * 1 1 2 3 5 8 13 21 34 55
 * 规律：一个数等于前两个数之和
 * 要求：计算斐波那契数列的第n个值，并将整个打印出来
 */
public class RecursionTest03 {
    public static void main(String[] args) {
        RecursionTest03 test03 = new RecursionTest03();
        for (int i = 1; i <= 10; i++) {
            System.out.print(test03.Fibonacci(i) + ",");
        }

    }
    public int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
