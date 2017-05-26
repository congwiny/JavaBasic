package com.congwiny.java8.lambda.method_ref;

public class Milk {
    public int getPrice(String brand) {
        switch (brand) {
            case "蒙牛牛奶":
                return 60;
            case "旺仔牛奶":
                return 30;
        }
        return 100;
    }
}
