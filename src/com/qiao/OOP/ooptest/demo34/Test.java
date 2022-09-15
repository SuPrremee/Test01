package com.qiao.OOP.ooptest.demo34;

/**
 * @ClassName BankTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 4:02 AM
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("tao","jiabao");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        System.out.println("Customer[" + customer.getFirstName() + customer.getLastName() + "的" +"账号：" + customer.getAccount().getId() + "，余额：" + customer.getAccount().getBalance() + "，年利率：" + customer.getAccount().getAnnuallnteresRate() + "]");
        account.deposit(100);
        System.out.println("Customer[" + customer.getFirstName() + customer.getLastName() + "的" +"账号：" + customer.getAccount().getId() + "，余额：" + customer.getAccount().getBalance() + "，年利率：" + customer.getAccount().getAnnuallnteresRate() + "]");
        account.withdraw(960);
        System.out.println("Customer[" + customer.getFirstName() + customer.getLastName() + "的" +"账号：" + customer.getAccount().getId() + "，余额：" + customer.getAccount().getBalance() + "，年利率：" + customer.getAccount().getAnnuallnteresRate() + "]");
        account.withdraw(2000);
        System.out.println("Customer[" + customer.getFirstName() + customer.getLastName() + "的" +"账号：" + customer.getAccount().getId() + "，余额：" + customer.getAccount().getBalance() + "，年利率：" + customer.getAccount().getAnnuallnteresRate() + "]");
    }
}
