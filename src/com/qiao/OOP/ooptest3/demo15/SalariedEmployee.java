package com.qiao.OOP.ooptest3.demo15;

/**
 * @ClassName SalariedEmployee
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 4:40 PM
 * @Version 1.0
 **/
public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee(String name, int number,MyDate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        //System.out.println("月计算工资" + monthlySalary);
        return monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee{" +
                super.toString()  + "}";
    }
}
