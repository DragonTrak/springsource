package com.stduy.factory.simple;

import com.stduy.factory.Audi;
import com.stduy.factory.Benz;
import com.stduy.factory.Bmw;
import com.stduy.factory.Car;

//对于这个工厂太强大了
//为什么?
//这个工厂啥都能干(不符合现实)
public class SimlleFactory {

    public Car getCar(String name){
        if ("BWM".equalsIgnoreCase(name)){
            return new Bmw();
        }else if ("BENZ".equalsIgnoreCase(name)){
            return new Benz();
        }else if ("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else {
            System.out.println("没有该工艺");
            return null;
        }
    }
}
