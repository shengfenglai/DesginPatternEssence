package com.lyx.ag.Strategy;

import org.springframework.stereotype.Service;

/**
 * Created by liyixiang on 2017/12/14.
 */
@Service
public class AxxxStrategy extends AbstractStrategy implements Strategy {

    @Override
    public void calculate(String param) {
        System.out.println(param);
    }
}
