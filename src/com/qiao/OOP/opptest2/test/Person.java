package com.qiao.OOP.opptest2.test;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 11:52 PM
 * @Version 1.0
 **/
public class Person {
    String name;
    int age;

    public void eat(){
        System.out.println("人：吃饭");
    }

    public void walk(){
        System.out.println("人：走路");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 :name.hashCode());
        return  result;
        //return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null) {
            return false;
        }
        //判断对象是由哪个类造的
        if (getClass() != o.getClass())
            return false;
        Person other = (Person) o;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
        //this指的是当前Person类 o是Man的引用对象
        //判断地址是否相同
//        if (this == o){
//            return true;
//        }
        //判断当前类是不是Person的实例化对象
        //o和Person必须是子类和父类的关系
//        if (o == instanceof PersonTest) {
//           PersonTest person = (PersonTest) o;
//           return this.age == person.age && this.name.equals(person.name);
//        }
//        return false
//
//
    }

}
