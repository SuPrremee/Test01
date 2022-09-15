package com.qiao.OOP.opptest2.demo03;

/**
 * @ClassName KidsTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 12:39 AM
 * @Version 1.0
 **/
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(1);
        someKid.setSalary(0);
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();
    }
}
