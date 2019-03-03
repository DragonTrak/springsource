package com.stduy.proxy.jdk;

public class TestFindLove {
    public static void main(String[] args) throws Throwable {
        Person target = new XiaoQiao();
        Person obj = null;
        try {
            obj = (Person)new GPMeipo().getInstance(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj.findLove();
    }
}
