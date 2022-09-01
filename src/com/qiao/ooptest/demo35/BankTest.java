package com.qiao.ooptest.demo35;

/**
 * @ClassName BankTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 5:25 AM
 * @Version 1.0
 **/
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //添加用户
        bank.addCustomer("tao","jiaobao");

        //找到添加的用户并且设置账户余额
        bank.getCustomer(0).setAccount(new Account(2000));

        //找到用户并给该账户取出500
        bank.getCustomer(0).getAccount().withdraw(500);

        //获取账户余额
        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + bank.getCustomer(0).getLastName() + "的账户余额为：" + balance);

        System.out.println("********************************************************");
        bank.addCustomer("陶","家宝");
        //找到添加的用户并且设置账户余额
        bank.getCustomer(1).setAccount(new Account(2000));

        //找到用户并给该账户取出500
        bank.getCustomer(1).getAccount().withdraw(500);

        //获取账户余额
        double balance1 = bank.getCustomer(1).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(1).getFirstName() + bank.getCustomer(1).getLastName() + "的账户余额为：" + balance1);
        System.out.println("银行客户的个数为：" + bank.getNumberOfCustomers());
    }
}
