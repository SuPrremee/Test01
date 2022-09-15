package com.qiao.OOP.ooptest.demo35;

/**
 * @ClassName Account
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 4:35 AM
 * @Version 1.0
 **/
public class Account {
    //属性
    private double balance;

    //构造器
    public Account(double balance) {
        this.balance = balance;
    }

    //访问器方法
    /**
     *
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 4:36 AM
     * @Param []
     * @return double
     * @Version v1.0
     **/

    public double getBalance() {
        return balance;
    }

    /**
     * 存钱
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 4:37 AM
     * @Param [amt]
     * @return void
     * @Version v1.0
     **/

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("成功存入：" + (amt));
        }
    }

    /**
     *  取钱
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 4:38 AM
     * @Param [amt]
     * @return void
     * @Version v1.0
     **/

    public void withdraw(double amt){
        //判断用户余额是否能够蛮虚提款数额的要求。如果不能，应给出提示
        if (this.balance < amt){
            System.out.println("余额不足，取款失败");
        }else {
            balance -= amt;
            System.out.println("成功取出：" + (amt));
        }
    }
}
