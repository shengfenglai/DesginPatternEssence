package com.lyx.ag.Template;

/**
 * @User: liyixiang
 * @Date: 2017/12/20
 * @TODO:
 *      具体实现模板方法的实现类，这里直接继承抽象类 而不需要implements接口
 * 因为具体的业务流程已经在抽象类中规定，对于实现类要屏蔽修改
*/
public class HttpTemplate extends AbstractTemplate {

    @Override
    protected void check() {
        System.out.println("http check");
    }

    @Override
    protected void process1() {
        System.out.println("http process1");
    }

    @Override
    protected void process2() {
        System.out.println("http process2");
    }

    @Override
    protected void process3() {
        System.out.println("http process3");
    }

    @Override
    protected void finish() {
        System.out.println("http finish");
    }
}
