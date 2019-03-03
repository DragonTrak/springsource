package com.stduy.proxy.jdk;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler {

    private Person target;

    /**
     * 获得代理对象
     * @param person
     * @return
     * @throws Exception
     */
    public Object getInstance(Person target) throws Throwable {
        this.target = target;
        Class clazz = target.getClass();
        System.out.println("被代理对象的class是："+clazz);
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
//        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("我是媒婆:你的性别是:"+ this.target.getSex()+"得帮你找个异性");
        System.out.println("开始进行海选。。。");
        System.out.println("---------------");
        method.invoke(this.target,args);
        System.out.println("---------------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
