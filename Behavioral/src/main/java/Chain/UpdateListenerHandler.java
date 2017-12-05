package Chain;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      修改监听处理链
*/
public class UpdateListenerHandler extends AbstractListenerChain {

    @Override
    public void handleMessage(IMessage mqMessage) throws Exception {
        System.out.println("update function");
    }

    @Override
    protected boolean compareActionCode(IMessage mqMessage) {
        return compareRules(ActionCode.UPDATE.getValue(),mqMessage);
    }
}
