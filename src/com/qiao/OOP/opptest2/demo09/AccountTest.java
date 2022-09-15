package com.qiao.OOP.opptest2.demo09;

/**
 * @ClassName AccountTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 10:41 PM
 * @Version 1.0
 **/
public class AccountTest {
    public static void main(String[] args) {
        //Account account = new Account(1122,20000,0.045);
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnuallnterestRate(0.045);
        account.withdraw(3000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("月利率：" + account.getMonthlyInterest());
    }

}
