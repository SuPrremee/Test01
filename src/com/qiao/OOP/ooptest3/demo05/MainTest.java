package com.qiao.OOP.ooptest3.demo05;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 5:07 PM
 * @Version 1.0
 **/
//
// main()方法的使用说明
// 1. main()方法作为程序的入口
// 2. main()方法也是也是一个普通的静态方法
// 3. main()方法可以作为我们与控制台的交互方式
//
//
//
//
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}

class Main{
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}