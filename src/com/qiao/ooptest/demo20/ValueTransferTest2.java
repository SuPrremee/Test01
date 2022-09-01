package com.qiao.ooptest.demo20;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m= " + data.m + ",n= " + data.n);

        //交换m和n的值
//        int temp = data.n;
//        data.n = data.m;
//        data.m = temp;
        ValueTransferTest2 test2 = new ValueTransferTest2();
        test2.swap(data);//指向堆中同一实体对象
        System.out.println("m= " + data.m + ",n= " + data.n);
    }
    public void swap(Data data){//指向堆中同一实体对象
        int temp = data.n;
        data.n = data.m;
        data.m = temp;
    }
}

class Data{
    int m;
    int n;
}