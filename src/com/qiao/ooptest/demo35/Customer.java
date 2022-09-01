package com.qiao.ooptest.demo35;


/**
 * @ClassName Customer
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 4:40 AM
 * @Version 1.0
 **/
public class Customer {

    //属性
    private String firstName;
    private String lastName;
    private Account account;

    //构造器
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //访问器方法

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
