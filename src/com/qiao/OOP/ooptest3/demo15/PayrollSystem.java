package com.qiao.OOP.ooptest3.demo15;

/**
 * @ClassName PayrollSystem
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:12 PM
 * @Version 1.0
 **/
public class PayrollSystem {
    private Employee[] employees = new Employee[10];

    public PayrollSystem() {
    }

//    @Override
//    public double earnings() {
//        return 0;
//    }

    public void printEmployee(Employee[] employees,int month){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为：" + salary);
            if (month == employees[i].getBirthday().getMoth()){
                System.out.println("生日快乐奖励100元,月工资为：" + (salary+100));
            }
        }
    }
}
