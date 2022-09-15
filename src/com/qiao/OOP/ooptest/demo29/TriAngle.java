package com.qiao.OOP.ooptest.demo29;

public class TriAngle {
    //属性
    private float base;
    private float height;

    //设置get和set访问私有属性
    public void setBase(float base){
        this.base = base;
    }
    public float getBase(){
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public TriAngle(float base,float height){
        this.base = base;
        this.height = height;
    }
}
