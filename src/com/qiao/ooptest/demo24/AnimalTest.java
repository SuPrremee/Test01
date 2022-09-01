package com.qiao.ooptest.demo24;

/**
 * 面向对象的特征一：封装与隐藏
 * 创建类对象以后，可以通过"对象.属性"的方法，对对象的属性进行赋值。这里，赋值操作要受到属性数据类型和数据类型范围的制约
 * 但是除此之外没有其他制约条件。但是在实际问题中，我们往往需要给属性赋值
 * 加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。（比如setLegs）
 * 同时我们需要避免用户再次使用"对象.属性"的方式对属性进行赋值。则需要将属性声明为私有的(private)
 * 此时，针对与属性就体现了封装性
 *
 * 封装型的体现
 * 体现一：我们将类的属性私有化（private），同时提供公共的(public)方法来获取(getXXX)和设置(setXXX)此属性的值
 * 体现二：不对外暴露的私有方法，单例模式
 *
 * 封装性的体现，需要权限修饰符来配合
 * 1.Java规定的4种权限：private、却省、protected、public（由小到大）
 * 2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 * 修饰类的话，只能使用：缺省、public
 *
 * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.name = "taojiabao";
        animal.setName("taojiabao");
        //animal.age = 1;
        animal.setAge(10);
        //animal.legs = 2;
        animal.setLegs(6);
        animal.eat();
        animal.show();
        System.out.println(animal.getLegs());
    }
}

class Animal{
    private String name;
    private int age;
    private int legs;

    /**
     * 如果需要对私有属性进行操作需要提供get和set方法
     * @param l
     */
    //对属性的设置
    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0){
            legs = l;
        }else {
            legs = 0;
        }
    }

    public void setName(String Name){
        if (Name == null){
            System.out.println("请给名字赋值");
        }else {
            name = Name;
        }
    }

    public void setAge(int Age){
        if (Age == 0){
            System.out.println("不合法");
        }else {
            age = Age;
        }
    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }



    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name=" + name + ",age=" + age + ",legs=" + legs);
    }
}