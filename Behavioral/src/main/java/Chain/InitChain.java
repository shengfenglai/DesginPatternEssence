package Chain;

/**
 * Created by liyixiang on 2017/12/5.
 */
public class InitChain {

    //构建责任链的方法
    public static AbstractListenerChain getFirstListenerNode(){

        //初始化所有链节点
        AbstractListenerChain addListener = new AddListenerHandler();
        AbstractListenerChain updateListener =new UpdateListenerHandler();
        AbstractListenerChain deleteListener =new DeteleListenerHandler();

        //形成责任链
        addListener.setNextListenerChain(updateListener);
        updateListener.setNextListenerChain(deleteListener);

        //返回首节点
        return addListener;
    }
}
