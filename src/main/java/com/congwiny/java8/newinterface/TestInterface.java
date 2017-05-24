package com.congwiny.java8.newinterface;

public class TestInterface {

    public static void main(String[] args){
        //调用接口中的静态方法
        JDK8Interface.staticMethod();
        //调用接口匿名实现类的默认实现方法
        new JDK8Interface(){}.defaultMethod();
        //调用接口实现类的默认方法
        JDK8InterfaceImpl impl = new JDK8InterfaceImpl();
        impl.defaultMethod();
    }
}
