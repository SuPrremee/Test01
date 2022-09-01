package com.qiao.ooptest.demo35;


/**
 * @ClassName Bank
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 4:42 AM
 * @Version 1.0
 **/
public class Bank {

    //属性
    private Customer[] customers;   //存放多个客户的数组
    private int numberOfCustomers;  //记录客户的个数

    //构造器
    public Bank(){
        customers = new Customer[10];
    }

    /**
     * 获取指定位置上的客户
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 5:13 AM
     * @Param [index]
     * @return com.qiao.ooptest.demo35.Customer
     * @Version v1.0
     **/

    public Customer getCustomer(int index) {
        if (index <0 && index > numberOfCustomers) {
            System.out.println("此位置没有客户");
            return null;
        } else {
            return customers[index];
        }
    }


    /**
     * 获取客户个数
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 5:10 AM
     * @Param [index]
     * @return int
     * @Version v1.0
     **/

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * 添加用户
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/30 5:10 AM
     * @Param [firstName, lastName]
     * @return void
     * @Version v1.0
     **/
    public void addCustomer(String firstName, String lastName){
        Customer customer = new Customer(firstName,lastName);
        this.customers[numberOfCustomers++] = customer;
    }
}
