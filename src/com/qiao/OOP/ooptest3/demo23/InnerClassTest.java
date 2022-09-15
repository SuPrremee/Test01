package com.qiao.OOP.ooptest3.demo23;

/**
 * @ClassName InnerClassTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/14 2:49 AM
 * @Version 1.0
 **/
public class InnerClassTest {

    //开发中很少见
    public void method(){
        //内部类
        class AA{

        }
    }
    //返回一个实现了comparable接口的类的对象
    public Comparable getComparable(){
        //创建一个实现了comparable接口的类
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
}