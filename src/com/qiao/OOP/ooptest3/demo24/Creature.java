package com.qiao.OOP.ooptest3.demo24;

public interface Creature {
}

 interface Person extends  Creature{
}
abstract class Man  implements Person{
}
class Woman{
 public void method(BB b){
  System.out.println("姓名：" + b.getName() + "，年龄：" +b.getAge());
 }
}
//abstract class Son extends Woman{
//}

abstract class AA{
 public abstract void eat();
}

abstract class BB{

 private String name;
 private int age;

 public BB(String name ,int age){
  this.name = name;
  this.age = age;
 }

 public String getName() {
  return name;
 }
 public int getAge() {
  return age;
 }
}

class DD extends BB{
 public DD(String name,int age){
  super(name, age);
 }
}

class CC{
 public static void main(String[] args) {
  AA a = new AA() {
   @Override
   public void eat() {
    System.out.println("吃饭");
   }
  };
  a.eat();
  DD d = new DD("陶家宝",31);
  Woman w = new Woman();
  w.method(d);
 }
}
//接口和接口之间多继承
interface SON extends Creature,Person{

}

