package com.qiao.OOP.ooptest.demo12;

/**
 * 对象数组的题目
 * 定义类Student，包含三个属性：学号number(int),年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3)的学生信息
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生的信息
 *
 * 提示：
 * 生成随机数：Math.random(),返回值类型double
 * 四舍五入区取整:Math.random(double d)，返回值类型long
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明对象数组
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++){
            //给数组元素赋值
            students[i] = new Student();
            //给Student对象赋值
            students[i].number = i+1;
            //年级[1-6]
            students[i].state = (int)(Math.random() * (6 - 1) + 1);
            //分数[0,100]
            students[i].score = (int)(Math.random() * (100 - 0 +1 ));
        }
        for (int i = 0; i < students.length; i++) {
            //System.out.println("学号：" + students[i].number + "," + "年级：" + students[i].state + "," + "分数：" +  students[i].score);
            System.out.println(students[i].info());
        }
        System.out.println("******************************************");
        //打印除3年级的学生信息
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3){
                System.out.println(students[i].info());
            }
        }
        System.out.println("*********************************************");
        //使用冒泡排序学生成绩
        Student temp = new Student();
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length - 1 -i; j++ ){
                if (students[j].score >= students[j+1].score){
                    temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].info());
        }
    }

}
class Student{
    //属性
    int number; //学号
    int state;  //年级
    int score;  //分数

    //显示学生信息的方法
    public String info(){
        return "学号：" + number + "," + "年级：" + state + "," + "分数：" +  score;
    }
}
