package com.qiao.OOP.opptest2.demo13;

/**
 * @ClassName InstanceTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 12:46 AM
 * @Version 1.0
 **/
public class InstanceTest {
    public static void main(String[] args) {
        //PersonTest p = new Graduate();
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }
    public void method(Person e){

        String info = e.getInfo();
        System.out.println(info);

        if (e instanceof Graduate){
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        } else if (e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        } else{
            System.out.println("a person");
        }

    }
}
