package com.qiao.ooptest.demo34;

/**
 * @ClassName Account
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 3:42 AM
 * @Version 1.0
 **/
public class Account {
    //属性
    private int id; //账号
    private double balance; //余额
    private double annuallnteresRate;   //年利率

    /**
     * 构造器
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 3:55 AM
     * @Param [id, balance, annuallnteresRate]
     * @return
     * @Version v1.0
     **/
    public Account(int id, double balance, double annuallnteresRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnteresRate = annuallnteresRate;
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

    public double getAnnuallnteresRate() {
        return annuallnteresRate;
    }

    public void setAnnuallnteresRate(double annuallnteresRate) {
        this.annuallnteresRate = annuallnteresRate;
    }

   /**
    * 取钱
    * @Description //TODO
    * @Author liuyuqiao
    * @Date 2022/8/30 3:51 AM
    * @Param [amount]
    * @return void
    * @Version v1.0
    **/
    public void withdraw(double amount){
        //判断用户余额是否能够蛮虚提款数额的要求。如果不能，应给出提示
        if (this.balance < amount){
            System.out.println("余额不足，取款失败");
        }else {
            balance -= amount;
            System.out.println("成功取出：" + (amount));
        }
    }

    /**
     * 存钱
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 3:52 AM
     * @Param [amount]
     * @return void
     * @Version v1.0
     **/
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入：" + (amount));
        }
    }
}
