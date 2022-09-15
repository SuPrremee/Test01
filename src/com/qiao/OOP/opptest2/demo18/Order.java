package com.qiao.OOP.opptest2.demo18;

/**
 * @ClassName Order
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 3:45 PM
 * @Version 1.0
 **/
public class Order {
    private int ordered;
    private String orderName;


    public Order(int ordered, String orderName) {
        super();
        this.ordered = ordered;
        this.orderName = orderName;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Order){
            Order order = (Order) obj;
            return getOrdered() == order.getOrdered() && getOrderName().equals(order.getOrderName());
        }else {
            return false;
        }
    }
}

class Test{
    public static void main(String[] args) {
        //Order order = new Order();
        Order order1 = new Order(12,"陶家宝");
        Order order2 = new Order(13,"陶家宝");
        System.out.println(order1.equals(order2));
    }
}