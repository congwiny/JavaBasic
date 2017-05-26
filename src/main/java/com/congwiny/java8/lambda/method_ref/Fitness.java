package com.congwiny.java8.lambda.method_ref;

/**
 * 表示函数式接口,这个注解可有可无
 * 只有在需要函数式接口时，才可以传递lambda表达式
 */
@FunctionalInterface
public interface Fitness {
    /**
     * 函数式接口里，只允许有一个抽象方法。
     * 抽象方法的签名基本上就算lambda表达式的签名
     * 所以这种函数式接口的抽象方法叫做函数操作符
     */
    void exercise();
}
