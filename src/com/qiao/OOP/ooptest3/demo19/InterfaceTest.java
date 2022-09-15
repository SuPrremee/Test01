package com.qiao.OOP.ooptest3.demo19;

/**
 * @ClassName InterfaceTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/11 9:15 AM
 * @Version 1.0
 **/
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        //c1相当于this.的对象
        int compareValue = c1.compareTo(c2);
        if (compareValue > 0){
            System.out.println("c1对象大");
        } else if (compareValue < 0) {
            System.out.println("c2对象大");
        }else {
            System.out.println("c1和c2一样大");
        }
    }
}
