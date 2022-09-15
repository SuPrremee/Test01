package com.qiao.OOP.opptest2.demo03;

/**
 * @ClassName Kids
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 12:39 AM
 * @Version 1.0
 **/
public class Kids extends ManKind {

    private int yearOld;

    public Kids(){

    }

    public Kids(int yearOld) {
        this.yearOld = yearOld;
    }

    public Kids(int sex, int salary, int yearOld) {
        super(sex, salary);
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println(yearOld);
    }
    @Override//重写注解
    public void employeed(){
        System.out.println("Kids should study and no job");
    }
}
