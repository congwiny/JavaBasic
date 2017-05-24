package com.congwiny.enumeration;

//添加public会报错啊
enum EnumColorWithConstructor {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);

    private String name;

    private int index;

    // 构造函数，枚举类型只能为私有
    EnumColorWithConstructor(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}