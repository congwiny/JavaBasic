package com.congwiny.java8.lambda.constructor_ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefTest {

    public static void main(String[] args) {
        Supplier<Apple> appleSupplier = () -> new Apple();
        Apple apple = appleSupplier.get();

        //等价于 构造函数的引用
        Supplier<Apple> appleSupplier1 = Apple::new;
        Apple apple1 = appleSupplier1.get();

        Function<Integer, Apple> function = (weight) -> new Apple(weight);
        Apple apple2 = function.apply(22);

        //使用构造函数的引用等价于
        Function<Integer, Apple> function1 = Apple::new;
        function1.apply(33);

        /**在下面的代码中，一个由Integer构成的List中的每个元素都通过我们前面定义的类似的
         map方法传递给了Apple的构造函数，得到了一个具有不同重量苹果的List：
         **/
        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);


        //使用多个参数的自定义函数式接口
        TriFunction<Integer, Integer, Integer, Color> colorFactory = Color::new;

    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
