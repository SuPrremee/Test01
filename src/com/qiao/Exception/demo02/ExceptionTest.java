package com.qiao.Exception.demo02;

/**
 * @ClassName ExceptionTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/14 5:03 PM
 * @Version 1.0
 **/

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 *  一、 异常体系结构
 *  java.lang.Throwable
 *          |----java.lang.Error:一般不编写针对性的代码进行处理
 *          |----java.lang.Exception:可以进行异常的处理
 *              |----编译时异常(checked)
 *                  |----IOException
 *                      |----FileNotFoundException
 *                  |----ClassNotFoundException
 *              |----运行时异常(unchecked)
 *                  |----NullPointerException
 *                  |----ArrayIndexOutOfBoundsException
 *                  |----ClassCastException
 *                  |----NumberFormatException
 *                  |----InputMismatchException
 *                  |----ArithmeticException
 */
public class ExceptionTest {
    //NullPointerException
    @Test
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[3]);
        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
    //ArrayIndexOutOfBoundsException
    @Test
    public void test2(){
//        int[] arr = new int[10];
//        System.out.println(arr[10]);
        //StringIndexOutOfBoundsException
        String str = "abc";
        System.out.println(str.charAt(3));

    }
    @Test
    public void test3(){
        //ClassCastException
        Object obj = new Date();
        String str = (String) obj;
    }
    //NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }
    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
        scanner.close();
    }
    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    //***********************************以下是编译时异常***********************************
    @Test
    public void test7(){
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//        int data = fis.read();
//        while(data != -1){
//            System.out.print((char) data);
//            data = fis.read();
//        }
//        fis.close();
    }
}
