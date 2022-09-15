package com.qiao.OOP.ooptest3.demo01;

/**
 * @ClassName StaticTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 12:44 AM
 * @Version 1.0
 **/

//
// static关键字的使用
// 1.static：静态的
// 2.static可以用来修饰：属性、方法、代码块、内部类
// 3.使用static修饰属性：静态变量、类变量(归类所有)
//                3.1 属性：按是否使用static修饰，分为：静态属性和非静态属性(实例变量：归具体对象所有)
//                  实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
//                          当修改其中一个对象中的非静态时，不会导致其他对象总同样的属性值的修改。
//                  静态变量：我们创建了类的多个对象，对歌对象共享同一个静态变量。当通过某一个对象修改静态变量时，
//                          会导致其他对象调用此静态变量时，是修改过的。
//                 3.2 static修饰属性的其他说明：
//                      1. 静态变量随着类的的加载而加载,可以通过"类.静态变量"的方式进行调用
//                      2. 静态变量的加载要早于对象的创建
//                      3.由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中
//                      4.      类变量       实例变量
//                      类       yes         no
//                      对象      yes        yes
//                 3.3 静态属性举例：System.out;Math.PI
//
//
// 4.使用static修饰方法：静态方法
//      1.随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
//      2.      静态方法    非静态方法
//      类       yes         no
//      对象      yes        yes
//      3. 静态方法中只能调用静态的方法或属性
//          非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
// 5. static注意点：
//    5.1 在静态方法内，不能使用this.关键字、super关键字(this和super都是基于对象而言)
//    5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解
//
// 6. 开发中，如何确定一个属性是否要声明为static的?
//      属性可以被多个对象所共享的，不会随着对象的不同而不同的
//      类中的常量也尝尝声明为static
//    开发中，如何确定一个方法是否要声明为static的？
//      操作静态属性的方法通常设置为static的
//      工具类的方法，习惯上声明为static的。比如Math、Arrays、Collections
//
//
//
//
//
//
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name = "陶家宝";
        c1.age = 31;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "taojiabao";
        c2.age = 31;
        c2.nation = "CHINA";

        //不能够通过类去调用实例变量
//      Chinese.name = "陶家宝";

        System.out.println(c1.nation);

        c1.eat();

        Chinese.show();

        //不能通过类调用非静态方法
//      Chinese.info();
    }
}
//中国人
class Chinese{
    String name;
    int age;

    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.info();
        System.out.println("name：" + name);
        //调用静态结构
        walk();
        System.out.println("nation：" + Chinese.nation);
    }

    //随着类的加载而加载
    //非静态结构是跟随对象的生命周期结束而结束；静态结构是跟随类的声明周期结束而结束
    public static void show(){
        //因为先加载的是static而name和eat();还没加载
        System.out.println("我是一个中国人");
        //不能在静态方法中调用非静态方法或属性
//        this.age = age;
//        eat();
        //可以调用静态结构
        walk();
        System.out.println(nation);
    }

    public void info(){
        System.out.println("name：" + name + "，age：" + age);
    }

    public static void walk(){

    }
}