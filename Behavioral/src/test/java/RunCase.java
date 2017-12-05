import Chain.AbstractListenerChain;
import Chain.ActionCode;
import Chain.IMessage;
import Chain.InitChain;
import org.junit.Test;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      行为型设计模式-测试用例
*/
public class RunCase {

    @Test
    public void testChain() throws Exception {
        IMessage mqMessage = new IMessage();
        mqMessage.setActionCode(ActionCode.DELETE.getValue());
        mqMessage.setContext("LYX");

        AbstractListenerChain abstractListenerChain = InitChain.getFirstListenerNode();//返回当前链节点
        abstractListenerChain.receiveMessageRequest(mqMessage);
    }

}
