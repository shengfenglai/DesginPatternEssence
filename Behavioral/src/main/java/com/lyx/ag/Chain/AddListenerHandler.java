package com.lyx.ag.Chain;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      添加监听处理链
*/
public class AddListenerHandler extends AbstractListenerChain {

    @Override
    public void handleMessage(IMessage mqMessage) throws Exception {
        System.out.println("add function");
    }

    @Override
    protected boolean compareActionCode(IMessage mqMessage) {
        return compareRules(ActionCode.ADD.getValue(),mqMessage);
    }
}
