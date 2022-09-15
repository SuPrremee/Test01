package com.qiao.OOP.ooptest3.demo17;

/**
 * @ClassName UsbTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/10 3:39 AM
 * @Version 1.0
 **/
//
// 接口的使用
//
// 体现了接口的多态性：因为new了实现类Flash
// 接口实际上就是定义了一种规范
public class UsbTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        //1.创建了非匿名实现类的非匿名对象
        Flash f = new Flash();
        c.transferData(f);
        //2. 创建了接口的非匿名实现类的匿名对象
        c.transferData(new Printer());
        //3. 创建了接口的匿名实现类的非匿名对象
        Usb phone = new Usb() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        c.transferData(phone);
        // 4. 创建了接口的匿名实现类的匿名对象
        c.transferData(new Usb() {
            @Override
            public void start() {
                System.out.println("mp3开始");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束");
            }
        });
    }
}

interface Usb{
    void start();
    void stop();
}

class Flash implements Usb{
    @Override
    public void start() {
        System.out.println("开始");
    }

    @Override
    public void stop() {
        System.out.println("结束");
    }
}

class Printer implements Usb{

    @Override
    public void start() {
        System.out.println("打印开始");
    }

    @Override
    public void stop() {
        System.out.println("打印结束");
    }
}

class Computer{
    public void transferData(Usb usb){
        usb.start();
        System.out.println("具体传输细节");
        usb.stop();
    }
}