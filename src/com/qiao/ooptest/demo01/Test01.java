package com.qiao.ooptest.demo01;

//类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值100。定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
public class Test01 {
    private int v = 100;

    //封装，构造get();和set();方法
    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
