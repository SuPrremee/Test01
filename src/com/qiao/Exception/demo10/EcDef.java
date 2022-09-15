package com.qiao.Exception.demo10;

/**
 * @ClassName EcDef
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/16 12:27 AM
 * @Version 1.0
 **/

/**
 *    自定义异常类
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -387516993124229948L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
