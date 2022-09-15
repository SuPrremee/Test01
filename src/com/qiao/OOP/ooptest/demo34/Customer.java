package com.qiao.OOP.ooptest.demo34;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 3:53 AM
 * @Version 1.0
 **/
public class Customer {
    //属性
    private String firstName;
    private String lastName;
    private Account account;

    /**
     * 构造器
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 4:00 AM
     * @Param [firstName, lastName]
     * @return
     * @Version v1.0
     **/

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
