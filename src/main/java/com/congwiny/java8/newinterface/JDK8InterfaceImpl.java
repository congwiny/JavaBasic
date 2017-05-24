package com.congwiny.java8.newinterface;

public class JDK8InterfaceImpl implements JDK8Interface,JDK8InterfaceCp{
    //不需要实现JDK8Interface中的方法，因为有了默认实现。
    //也可以选择重写JDK8Interface中的非静态方法，
    // 静态方法是属于一个类的，无法重写

    /**
     * 因为JDK8Interface,JDK8InterfaceCp中有相同的默认方法，所以这里必须要重写，不然会编译出错
     */
    @Override
    public void defaultMethod(){
        System.out.println("接口实现类中的默认方法的重写");
    }

}
