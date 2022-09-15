package com.qiao.OOP.ooptest3.demo15;

/**
 * @ClassName MyDate
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 4:18 PM
 * @Version 1.0
 **/
public class MyDate {
    private int year;
    private int moth;
    private int day;

    public MyDate(int year,int moth,int day){
        this.day = day;
        this.moth = moth;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        //System.out.println(year + "年" + moth + "月" + day + "日");
        return year + "年" + moth + "月" + day + "日";
    }
}
