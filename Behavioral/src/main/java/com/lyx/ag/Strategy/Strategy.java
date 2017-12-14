package com.lyx.ag.Strategy;

/**
 * @User: liyixiang
 * @Date: 2017/12/14
 * @TODO:
 *      策略接口
*/
public interface Strategy {

    //计算逻辑，该逻辑会根据不同场景进行不同计算规则处理
    void calculate(String param);

}
