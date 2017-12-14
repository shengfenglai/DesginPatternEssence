package com.lyx.ag.Strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @User: liyixiang
 * @Date: 2017/12/14
 * @TODO:
 *      策略工厂
*/
@Service
public class StrategyFactory {

    @Autowired
    private Map<String,Strategy> nameToStrategyMap = new HashMap<>();

    public Strategy getStrategy(EnumStrategy eStrategy){
        return nameToStrategyMap.get(eStrategy.getDesc());
    }
}
