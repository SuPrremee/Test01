package com.qiao.OOP.opptest2.demo09;

/**
 * @ClassName Account
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 10:33 PM
 * @Version 1.0
 **/
public class Account {
    //属性
    private int id; //账号id
    private double balance; //余额balance
    private double annuallnterestRate;  //年利率

    //构造器

    public Account() {
        super();
    }

    public Account(int id, double balance, double annuallnterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }
    //访问器

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
    /**
     *
     * @Description //TODO
     * 返回月利率
     * @Author liuyuqiao
     * @Date 2022/9/3 10:39 PM
     * @Param []
     * @return double
     * @Version v1.0
     **/

    public double getMonthlyInterest(){
        return this.annuallnterestRate / 12;
    }
    /**
     *
     * @Description //TODO
     * 取款方法
     * @Author liuyuqiao
     * @Date 2022/9/3 10:39 PM
     * @Param [amount]
     * @return void
     * @Version v1.0
     **/

    public void withdraw(double amount){
        if (balance <= amount){
            System.out.println("余额不足");
        }else {
            balance -= amount;
            //System.out.println("当前余额为：" + balance);
        }
    }
    /**
     *
     * @Description //TODO
     * 存款方法
     * @Author liuyuqiao
     * @Date 2022/9/3 10:39 PM
     * @Param [amount]
     * @return void
     * @Version v1.0
     **/

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("当前余额为：" + balance);
        }
    }
}
