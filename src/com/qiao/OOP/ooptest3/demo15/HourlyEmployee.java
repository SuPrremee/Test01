package com.qiao.OOP.ooptest3.demo15;

/**
 * @ClassName HourlyEmployee
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:05 PM
 * @Version 1.0
 **/
public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee(String name, int number,MyDate birthday,double wage,int hour){
        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double earnings(){
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee{" +
                super.toString() + "}";
    }
}
