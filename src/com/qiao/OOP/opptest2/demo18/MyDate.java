package com.qiao.OOP.opptest2.demo18;

/**
 * @ClassName MyDate
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 3:58 PM
 * @Version 1.0
 **/
public class MyDate {
    private int year;
    private String moth;
    private String day;

    public MyDate(int year, String moth, String day) {
        super();
        this.year = year;
        this.moth = moth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMoth() {
        return moth;
    }

    public void setMoth(String moth) {
        this.moth = moth;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o instanceof MyDate){
            MyDate myDate = (MyDate) o;
            return getYear() == myDate.getYear() && getMoth().equals(myDate.getMoth()) && getDay().equals(getDay());
        }else return false;
    }
public static void main(String[] args) {
    MyDate myDate1 = new MyDate(2012,"04","22");
    MyDate myDate2 = new MyDate(2012,"04","22");


    System.out.println(myDate2.equals(myDate1));
}
}

//class test{
//    public static void main(String[] args) {
//
//
//
//    }
//}
