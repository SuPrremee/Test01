package com.qiao.OOP.opptest2.demo04;

/**
 * @ClassName CylinderTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 1:42 AM
 * @Version 1.0
 **/
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(1);
        cy.setLength(1);

        double volume = cy.findVolume();
        System.out.println("圆的体积：" + volume);

        double area = cy.findArea();
        System.out.println("圆的表面积" + area);
    }
}
