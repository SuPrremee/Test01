package com.qiao.OOP.ooptest3.demo14;

/**
 * @ClassName TemplateTeat
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 3:05 PM
 * @Version 1.0
 **/
//
// 抽象类的应用：模版方法的设计模式
//
//
//
//
//
//
//
//
//
//
public class TemplateTeat {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    //计算某段代码执行所需要花费的时间
    public void spendTime(){
        long start =  System.currentTimeMillis();
        //this指的是t
        this.code(); //  不确定的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract  void code();
}

class SubTemplate extends Template{
    public void code(){
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j ==0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}