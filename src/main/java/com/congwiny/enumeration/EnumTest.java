package com.congwiny.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args) {
        //enum color red=RED
        System.out.println("enum color red1=" + EnumColor.RED.name());

        //遍历枚举值
        EnumColor[] colors = EnumColor.values();
        for (EnumColor color : colors) {
            System.out.println("color name=" + color.name() + ",ordinal=" + color.ordinal());
        }

        //根据枚举名称获取枚举对象
        EnumColor enumColor = EnumColor.valueOf("RED");
        System.out.println("enum color red2=" + enumColor.name());
        //true
        System.out.println("enum color red=="+(enumColor==EnumColor.RED));

        //从EnumColor获取EnumSet
        EnumSet<EnumColor> colorEnumSet = EnumSet.allOf(EnumColor.class);
        for (EnumColor enumColor1 : colorEnumSet) {
            System.out.println("enum set contain color==" + enumColor1.name());
        }

        EnumSet<EnumColor> rangeEnumSet = EnumSet.range(EnumColor.GREEN,EnumColor.YELLOW);
        for (EnumColor enumColor2 : rangeEnumSet) {
            System.out.println("enum range set contain color==" + enumColor2.name());
        }

        //KEY是Enum,value是任意类型
        EnumMap<EnumColor,String> enumMap = new EnumMap<EnumColor, String>(EnumColor.class);
        enumMap.put(EnumColor.BLACK,"black black");
        enumMap.put(EnumColor.GREEN,"green green");

        System.out.println("enum map get = "+enumMap.get(EnumColor.GREEN));
    }
}
