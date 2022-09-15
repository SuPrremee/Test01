package com.qiao.OOP.opptest2.demo09;

/**
 * @ClassName CheckAccount
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 11:03 PM
 * @Version 1.0
 **/
public class CheckAccount extends Account {
    //属性
    private double overdraft;
    //构造器
    public CheckAccount(){
        super();
    }

    public CheckAccount(int id, double balance, double annuallnterestRate,double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }
    //访问器

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    @Override
    public void withdraw(double amount){
        if (amount < getBalance()){
            //方式一：
//            double money = getBalance();
//            setBalance(money-amount);
            //方式二
            super.withdraw(amount);
            System.out.println("当前余额：" + getBalance() + ",可透支余额：" + getOverdraft());
            return;
        }
        if (amount > getBalance()){
            double money = amount - getBalance();
            if (overdraft >= money){
                setBalance(0);
                setOverdraft(overdraft - money);
                System.out.println("当前余额：" + getBalance() + ",可透支余额：" + getOverdraft());
            }else {
                System.out.println("超过可透支的限额");
            }
        }
    }
}
