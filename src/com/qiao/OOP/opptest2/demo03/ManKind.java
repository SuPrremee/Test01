package com.qiao.OOP.opptest2.demo03;

/**
 * @ClassName ManKind
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 12:39 AM
 * @Version 1.0
 **/
public class ManKind {
    private int sex;
    private int salary;

    public ManKind(){

    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1)
            System.out.println("man");
        else
            System.out.println("woman");
    }
    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else System.out.println("job");
    }
}
