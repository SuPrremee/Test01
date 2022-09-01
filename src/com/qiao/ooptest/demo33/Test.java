package com.qiao.ooptest.demo33;

/**
 * @ClassName BankTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 3:34 AM
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("taojiabao",21);
        boy.shout();

        Girl girl = new Girl("陶家宝",20);
        girl.marry(boy);

        Girl girl1 = new Girl("taojiabao",19);
        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl.getName() + "小");
        }else {
            System.out.println("一样大");
        }
    }
}
