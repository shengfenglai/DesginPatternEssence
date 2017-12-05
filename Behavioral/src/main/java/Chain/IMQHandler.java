package Chain;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      MQ处理接口
*/
public interface IMQHandler {

    //具体处理消息的业务方法
    void handleMessage(IMessage mqMessage) throws Exception;
}
