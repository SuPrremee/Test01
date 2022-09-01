package com.qiao.ooptest.demo33;

public class Girl {
    //属性
    private String name;
    private int age;

    //构造器
    public Girl(){

    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get、set方法
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    // 其他方法
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        //boy.marry(new Girl());
        boy.marry(this);
    }

    /**
     *
     * @Description //比较两个对象的大小
     * @Author liuyuqiao
     * @Date 2022/8/30 3:29 AM
     * @Param [girl]
     * @return int 正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
     * @Version v1.0
     **/


    public int compare(Girl girl){
//        if (this.age > girl.age){
//            return 1;
//        }else if (this.age < girl.age){
//            return -1;
//        }else {
//            return 0;
//        }
        return this.age - girl.age;
    }
}
