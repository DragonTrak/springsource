package com.stduy.proxy.cglib;

public class TestCGlibProxy {
    public static void main(String[] args) {
        try {
            //jdk的动态代理是来通过接口来进行强制转换的
            //生成以后的代理对象是可以强制转换为我们的接口

            //cglib的动态代理是通过生成一个被代理对象的子类,然后通过重写父类的方法
            //生成以后的对象,可以强制转换为被代理对象(也就是用自己写的类)
            //子类引用赋值给父类对象

            LiBai libai = (LiBai)new GPMeiPo().getInstance(LiBai.class);

            libai.findLove();
//            Object obj = (LiBai)new GPMeiPo().getInstance("com.stduy.proxy.cglib.LiBai");
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
