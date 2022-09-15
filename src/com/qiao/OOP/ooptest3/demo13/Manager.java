package com.qiao.OOP.ooptest3.demo13;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:31 AM
 * @Version 1.0
 **/
public class Manager extends Employee {
    double bonus;
    public Manager(String name, int id , double salary , double bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println("工作才能赚钱");
    }
}
