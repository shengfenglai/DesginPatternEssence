package com.lyx.ag.Template;

/**
 * @User: liyixiang
 * @Date: 2017/12/20
 * @TODO:
 *      抽象模板 实现模板中的处理方法，这里的实现只是规范该方法的业务流程 并不是真正实现内部业务逻辑
 * 业务逻辑还可以进一步抽象出来，由不同的实现类实现
*/
public abstract class AbstractTemplate implements Template {

    @Override
    public void process(String param) {
        //校验
        check();
        //处理流程1
        process1();
        //处理流程2
        process2();
        //处理流程3
        process3();
        //完成
        finish();
    }

    protected abstract void check();

    protected abstract void process1();

    protected abstract void process2();

    protected abstract void process3();

    protected abstract void finish();
}
