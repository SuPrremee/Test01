package com.qiao.OOP.ooptest3.demo13;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:38 AM
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //Manager manager = new Manager("陶家宝",1101,2000,1000);
        //多态
        Employee manager1  = new Manager("陶家宝",1101,2000,1000);
        System.out.println(manager1.getName());
        System.out.println(manager1.getId());
        System.out.println(manager1.getSalary());
        manager1.work();
        //CommonEmployee commonEmployee = new CommonEmployee();
        Employee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
