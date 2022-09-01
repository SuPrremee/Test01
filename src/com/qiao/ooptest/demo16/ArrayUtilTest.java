package com.qiao.ooptest.demo16;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (100-0)+1);
        }
        //打印数组
        System.out.println("打印数组：");
        arrayUtil.print(arr);
        System.out.println();

        //求数组最小值
        System.out.println("数组最小值：" + arrayUtil.getMin(arr));

        //求数组最大值
        System.out.println("数组最大值：" + arrayUtil.getMax(arr));

        //求数组总和
        System.out.println("数组总和：" + arrayUtil.getSum(arr));

        //求数组平均值
        System.out.println("数组平均值：" + arrayUtil.getAvg(arr));

        //反转数组
        System.out.println("反转数组：");
        arrayUtil.reverse(arr);
        arrayUtil.print(arr);
        System.out.println();

        //排序数组
        System.out.println("排序数组");
        arrayUtil.sort(arr);
        arrayUtil.print(arr);
        System.out.println();

        //查找数组元素
        System.out.println("查找差数组元素：");

        if (arrayUtil.getIndex(arr,93) == 0){
            System.out.println("没有查到93!");
        }else {
            System.out.println("已查到。" + 93);
        }

        System.out.println("复制数组：");
        arrayUtil.copy(arr);
        arrayUtil.print(arr);
    }
}
