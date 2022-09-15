package com.qiao.OOP.ooptest.demo16;

/**
 * 自定义数组的工具类
 */
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue <= arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //求数组的最小值
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //求数组的总和
    public int getSum(int[] arr){
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return arrSum;
    }

    //求数组的平均值
    public int getAvg(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return arrSum/arr.length;
    }

    //反转数组
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    //查找指定数组
    public int getIndex(int[] arr,int dest){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest){
                return dest;
            }
        }
        return 0;
    }
}
