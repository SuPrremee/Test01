package com.qiao.OOP.ooptest3.demo13;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:15 AM
 * @Version 1.0
 **/
public abstract class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name, int id, double salary){
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void  work();
}
