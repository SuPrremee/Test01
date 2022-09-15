package com.qiao.OOP.ooptest3.demo03;

/**
 * @ClassName Account
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 12:12 PM
 * @Version 1.0
 **/
public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney;
    private static int init = 1001; //用户自动生成id的使用

    public Account(){
        id = init++;
    }

    public Account(String pwd, double balance){
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
