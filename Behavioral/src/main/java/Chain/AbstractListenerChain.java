package Chain;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *    抽象责任链 负责公共属性抽取
*/
public abstract class AbstractListenerChain implements IMQHandler {

    protected AbstractListenerChain nextListenerChain;          //下一个责任链节点的引用

    //设置下一个链节点
    public void setNextListenerChain(AbstractListenerChain nextListenerChain) {
        this.nextListenerChain = nextListenerChain;
    }

    /**
     *
     * @throws Exception
     * @liyixiang
     * @TODO:
     * 		接收MQ中的消息，根据ActionCode来判断
     * 是何种操作类型
     */
    public void receiveMessageRequest(IMessage mqMessage) throws Exception{
        //判断actionCode是否符合
        if(compareActionCode(mqMessage)){
            handleMessage(mqMessage);
        }

        //如果不符合，继续向下传递请求
        if(nextListenerChain !=null){
            nextListenerChain.receiveMessageRequest(mqMessage);
        }
    }

    //actionCode比较规则
    protected boolean compareRules(int actionCode,IMessage mqMessage){
        return actionCode == mqMessage.getActionCode();
    }

    //---------   具体处理消息业务逻辑 & 判断ActionCode的业务逻辑 【统一在实现类中扩展】--------
    //具体处理消息的业务方法
    public abstract void handleMessage(IMessage mqMessage) throws Exception;

    //请求比较判断方法
    protected abstract boolean compareActionCode(IMessage mqMessage);



}
