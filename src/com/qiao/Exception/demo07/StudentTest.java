package com.qiao.Exception.demo07;

import com.qiao.Exception.demo08.MyException;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/15 7:21 PM
 * @Version 1.0
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regis(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }
}

class Student{
    private int id;
    public void regis(int id) throws Exception{
        if (id > 0){
            this.id = id;
        }else {
//            System.out.println("您输入的数据非法！");
            //手动抛出异常对象
//            throw new RuntimeException("您输入的数据非法！");
//            throw new Exception("您输入的数据非法！");
            throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}