package com.qiao.OOP.opptest2.demo09;

/**
 * @ClassName CheckAccountTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 11:16 PM
 * @Version 1.0
 **/
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(2000);
        checkAccount.withdraw(3000);
    }
}
