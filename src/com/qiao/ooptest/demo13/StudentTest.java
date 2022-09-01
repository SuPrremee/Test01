package com.qiao.ooptest.demo13;

public class StudentTest {
    public static void main(String[] args) {
        //实例化StudentTest对象
        StudentTest studentTest = new StudentTest();
        //声明Student对象数组
        Student[] students = new Student[20];
        //初始化Student对象数组
        studentTest.InitInfo(students);
        //打印Student对象数组
        studentTest.print(students);
        System.out.println("***********************************");
        //打印3年级的学生信息
        studentTest.printState(students);
        System.out.println("***********************************");
        //使用冒泡排序按学生的成绩排序，并遍历所有学生信息
        studentTest.sortScore(students);
        studentTest.print(students);
    }

    public void InitInfo(Student[] students){
        for (int i = 0; i < students.length; i++) {
            //给数组对象赋值
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state = (int)(Math.random() * (6 - 1) + 1);
            students[i].score = (int)(Math.random() * (100 - 0) + 1);
        }
    }
    public void print(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Info());
        }
    }
    public void printState(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3){
                System.out.println(students[i].Info());
            }
        }
    }

    public void sortScore(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-i-1; j++){
                if (students[j].score >= students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
class Student{
    //属性
    int number; //学号
    int state;  //年级
    int score;  //分数
    
    //方法
    public String Info(){
        return "学号：" + number + ", 年级：" + state + ", 分数：" + score;
    }
}