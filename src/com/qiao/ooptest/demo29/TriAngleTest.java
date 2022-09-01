package com.qiao.ooptest.demo29;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle test = new TriAngle(2,2);
        test.setBase(1);
        test.setHeight(1);
        float area = test.getHeight() * test.getBase() * 1 / 2;
        System.out.println(area);
    }

}
