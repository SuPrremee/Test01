package com.qiao.ooptest.demo21;

/**
 * 定义一个int型的数组：int[] arr = new int[]{12,3,3,34,56,77,432};
 * 计算数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的新值。遍历新的数组
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,3,34,56,77,432};
        Test01 test = new Test01();
        test.print(arr);
        System.out.println();
        System.out.println("********************");
        test.method(arr);
        test.print(arr);

    }
    public void method(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= 10 && array[i] < 100){
//                int temp = array[i]/10;
//                array[i] = array[i]/temp;
//            }else if (array[i] >= 100 && array[i] <1000){
//                int temp = array[i]/100;
//                array[i] = array[i]/temp;
//            }else {
//                int temp = array[i]%10;
//                array[i] = array[i]/temp;
//            }
//        }
        //方法1
        for (int i = array.length-1; i >= 0; i--) {
            array[i] = array[i]/array[0];
        }
        //方法2
//        int temp = array[0];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i]/temp;
//        }
    }

    public void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}