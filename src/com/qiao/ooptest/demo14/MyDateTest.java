package com.qiao.ooptest.demo14;
/**
 * 声明一个日期类型myDate
 * 有属性年year，月moth，日day。
 * 创建2个日期对象，分别为：你的出生日期，你对象的出生日期，并显示信息
 */
public class MyDateTest {
    public static void main(String[] args) {
        myData myData1 = new myData();
        myData myData2 = new myData();
        myData1.year = "1997";
        myData1.moth = "04";
        myData1.day = "22";
        myData2.year = "1998";
        myData2.moth = "03";
        myData2.day = "02";
        System.out.println(myData1.print(myData1));
        System.out.println(myData2.print(myData2));
    }
}


class myData{
    //属性
    String year;
    String moth;
    String day;

    //方法
    public String print(myData myData){
        return  myData.year+"年," + myData.moth + "月," + myData.day + "日";
    }
}