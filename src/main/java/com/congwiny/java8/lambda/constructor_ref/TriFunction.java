package com.congwiny.java8.lambda.constructor_ref;
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}