package com.qiao.OOP.ooptest3.demo05;

/**
 * @ClassName MainDemo
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 5:16 PM
 * @Version 1.0
 **/

// 1. javac MainDemo.java
// 2. java MainDemo
// 3. java MainDemo "字符串" "字符串" 字符串
// 4. 注意删除package包
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("*****" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("####" + num);
        }
    }
}
