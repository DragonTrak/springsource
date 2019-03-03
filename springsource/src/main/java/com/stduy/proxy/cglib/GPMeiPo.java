package com.stduy.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GPMeiPo implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        //cglib生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);

        //第一步 生成源代码
        //第二步 编译成class文件
        //第三步 加载到jvm中,并返回被代理对象
        return enhancer.create();
    }

    //同样是做了字节码重组这样一件事
    //对于使用api的用户来说,是无感知的
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我是沽泡媒婆");
        System.out.println("开始进行海选。。。");
        System.out.println("---------------");
        //这个obj的引用是由cglib给我们new出来的
        //new 出来的对象是被代理对象的子类(继承了我们写的那个类)
        //oop,在new子类之前,实际上默认先调用super()方法的,也就是说new了子类的同时,
        //也必须先new出来父类,这就相当于间接的持有了父类的应用
        //子类重写了父类的所有方法,我们改变子类对象的某些属性,是可以间接的操作到父类的属性的
        proxy.invokeSuper(obj, args);
        System.out.println("---------------");
        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
