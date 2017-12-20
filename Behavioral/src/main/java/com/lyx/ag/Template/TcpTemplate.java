package com.lyx.ag.Template;

/**
 * @User: liyixiang
 * @Date: 2017/12/20
 * @TODO:
 *      另一个实现类
*/
public class TcpTemplate extends AbstractTemplate {

    @Override
    protected void check() {
        System.out.println("tcp check");
    }

    @Override
    protected void process1() {
        System.out.println("tcp process1");
    }

    @Override
    protected void process2() {
        System.out.println("tcp process2");
    }

    @Override
    protected void process3() {
        System.out.println("tcp process3");
    }

    @Override
    protected void finish() {
        System.out.println("tcp finish");
    }
}
