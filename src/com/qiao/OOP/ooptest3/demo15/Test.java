package com.qiao.OOP.ooptest3.demo15;

import java.util.Calendar;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 5:01 PM
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        employee[0] = new SalariedEmployee("陶家宝",1001,new MyDate(2012,04,22),2000);
        employee[1] = new HourlyEmployee("taojiabao",1002,new MyDate(2012,9,06),30,80);
//        employee.earnings();
        //System.out.println(employee.toString());

        System.out.println("**********************");
        //方式一：
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("本月：");
//        int moth = scanner.nextInt();
        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);   //获取当前月份
        System.out.println(month);
        PayrollSystem p = new PayrollSystem();
        p.printEmployee(employee,month+1);
        //scanner.close();
    }
}
