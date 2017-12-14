import com.lyx.ag.Chain.AbstractListenerChain;
import com.lyx.ag.Chain.ActionCode;
import com.lyx.ag.Chain.IMessage;
import com.lyx.ag.Chain.InitChain;
import com.lyx.ag.Strategy.EnumStrategy;
import com.lyx.ag.Strategy.Strategy;
import com.lyx.ag.Strategy.StrategyFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Test
    public void testStrategy() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StrategyFactory strategyFactory = (StrategyFactory)ac.getBean("strategyFactory");
        Strategy strategy =strategyFactory.getStrategy(EnumStrategy.AStrategy);
        strategy.calculate(EnumStrategy.AStrategy.getDesc());
    }

}
