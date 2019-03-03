package com.stduy.proxy.jdk;

public class XiaoQiao implements Person {
    private String sex = "女";
    private String name = "XiaoQiao";

    @Override
    public void findLove() {
        System.out.println("我叫"+this.name+" ");
        System.out.println("高富帅");
        System.out.println("有房有车");
        System.out.println("身高180cm以上，体制70Kg");
    }

//    @Override
    public String getSex() {
        return sex;
    }

//    @Override
    public String getName() {
        return name;
    }
}
