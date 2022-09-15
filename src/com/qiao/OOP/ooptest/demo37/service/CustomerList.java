package com.qiao.OOP.ooptest.demo37.service;

import com.qiao.OOP.ooptest.demo37.bean.Customer;

/**
 * @ClassName CustomerList
 * @Description CustomerList为Customer对象的管理模块
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历的方法
 * 供CustomerView调用
 * @Author liuyuqiao
 * @Data 2022/8/30 10:14 PM
 * @Version 1.0
 **/
public class CustomerList {
    //属性
    private Customer[] customers;  //用来保护客户对象的数组

    //显式初始化
    //private Customer[] customers = new Customer[10] ;//用来保护客户对象的数组
    private int total = 0;  //记录已保存客户对象的数量

    //构造器

    /**
     * @return
     * @Description //用途：构造器用来初始化customer数组
     * @Author liuyuqiao
     * @Date 2022/8/31 1:53 AM
     * @Param [totalCustomer]//参数：totalCustomer：指定customer数组的最大空间
     * @Version v1.0
     **/

    public CustomerList(int totalCustomer) {
        //构造器动态初始化
        customers = new Customer[totalCustomer];
    }


    /**
     * //访问器方法
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/31 3:04 AM
     * @Param []
     * @return com.qiao.OOP.ooptest.demo37.bean.Customer[]
     * @Version v1.0
     **/

    public Customer[] getAllCustomers() {
        Customer[] customers = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers[i] =this.customers[i];
        }
        return customers;
    }

    /**
     * //获取指定索引位置上的用户
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/31 3:04 AM
     * @Param [index]
     * @return com.qiao.OOP.ooptest.demo37.bean.Customer
     * @Version v1.0
     **/

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total ){
            System.out.println("索引失败");
            return null;
        }
        return customers[index];
    }

    /**
     *
     * @Description //TODO 
     * @Author liuyuqiao
     * @Date 2022/8/31 3:07 AM
     * @Param []
     * @return int
     * @Version v1.0
     **/
    
    public int getTotal() {
        return total;
    }


    /**
     * //添加用户
     * @Description //用途：将参数customer添加组中最后一个客户对象记录之后
     * @Author liuyuqiao
     * @Date 2022/8/31 1:59 AM
     * @Param [customer] //参数：customer指定要添加的客户对象
     * @return boolean //返回：添加成功返回true；false表示数组已满，无法添加
     * @Version v1.0
     **/

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length){
            System.out.println("添加用户失败");
            return false;
        }else {
            customers[total++] = customer;
            System.out.println("添加用户成功");
            return true;
        }
    }

    /**
     * //修改用户
     * @Description //用途：用参数customer替换数组中有index指定的对象
     * @Author liuyuqiao
     * @Date 2022/8/31 2:00 AM
     * @Param [index, customer]
     * 参数：customer指定替换的新客户对象
     *        index指定所替换对象在数组中的位置，从0开始
     * @return boolean
     * 返回：替换成功返回true；false表示索引无效，无法替换
     * @Version v1.0
     **/

    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total){
            System.out.println("修改失败，用户不存在");
            return false;
        }else {
            customers[index] = customer;
            System.out.println("用户信息修改成功");
            return true;
        }
    }


    /**
     * //删除用户
     * @Description //TODO
     * @Author liuyuqiao
     * @Date 2022/8/31 2:32 AM
     * @Param [index]
     * @return boolean true：删除成功；false：删除失败
     * @Version v1.0
     **/

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total){
            System.out.println("删除失败");
            return false;
        }else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i+1];
            }
            customers[total-1] = null;
            total--;
            System.out.println("删除成功");
            return true;
        }
    }
}

