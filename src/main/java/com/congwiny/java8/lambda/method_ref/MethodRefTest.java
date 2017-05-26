package com.congwiny.java8.lambda.method_ref;

import java.util.Arrays;
import java.util.List;

public class MethodRefTest {

    public static void main(String[] args) {
        //lambda表达式。
        /**
         * lambda表达式,也成为函数
         * () -> Project.running()
         * 表示参数列表为空，返回结果为void的函数
         *
         * (Apple,Apple) -> int
         * 表示接受两个Apple作为参数且返回int的函数
         */
        gotoFitness(() -> Project.running());

        /**
         * 1.指向 静态方法 的方法引用
         */
        gotoFitness(Project::swimming);

        /**--------------------------------------------**/

        List<String> str = Arrays.asList("a", "b", "A", "B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        /**
         * 2.指向 任意类型实例方法 的方法引用
         */
        str.sort(String::compareToIgnoreCase);
        /**--------------------------------------------**/

        Milk milk = new Milk();
        //m1-旺仔牛奶传过来
        int cost = goShopping((m1) -> milk.getPrice(m1));
        /**
         * 3.指向 现有对象的实例方法 的方法引用
         */
        int cost2 = goShopping(milk::getPrice);
        System.out.println("旺仔牛奶的价格==" + cost2);


    }


    /**
     * 去健身
     *
     * @param fitness
     */
    public static void gotoFitness(Fitness fitness) {
        fitness.exercise();
    }

    /**
     * 我只是去买牛奶，具体实现不知道哦。。看我怎么传啦
     *
     * @param shopping
     * @return
     */
    public static int goShopping(Shopping shopping) {
        return shopping.buy("旺仔牛奶");
    }

}
