package com.lyx.ag.Strategy;

/**
 * @User: liyixiang
 * @Date: 2017/12/14
 * @TODO:
 *      策略枚举
*/
public enum EnumStrategy {

    AStrategy(1,"AxxxStrategy"),
    BStrategy(2,"BxxxStrategy");

    private int value;

    private String desc;

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    private EnumStrategy(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
