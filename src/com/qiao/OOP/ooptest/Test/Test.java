package com.qiao.OOP.ooptest.Test;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/31 8:15 PM
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //next以空格和回车作为结束符
//        String str = scanner.next();
//        System.out.println(str);
//        int num = scanner.nextInt();
//        System.out.println(num);
        //nextLine以回车作为结束符
//        String str = scanner.nextLine();
//        System.out.println(str);

        String str = "";
        int i = 0;
        //hasNext()不把换行计算在内，只作为结束符
//        while (scanner.hasNext()){
//            str = scanner.nextLine();
//            i = str.length();
//            break;
//        }

//        while (scanner.hasNextLine()){
//            str = scanner.nextLine();
//            i = str.length();
//            break;
//        }


//        while(scanner.hasNextLine()){
//            str = scanner.next();
//            i = str.length();
//            break;
//        }
        while(scanner.hasNext()){
            str = scanner.nextLine();
            i = str.length();
            break;
        }
        System.out.println(i);
        System.out.println(str);
        scanner.close();
    }
}
