package Chain;

/**
 * Created by liyixiang on 2017/12/5.
 */
public class DeteleListenerHandler extends AbstractListenerChain {

    @Override
    public void handleMessage(IMessage mqMessage) throws Exception {
        System.out.println("delete function");
    }

    @Override
    protected boolean compareActionCode(IMessage mqMessage) {
        return compareRules(ActionCode.DELETE.getValue(),mqMessage);
    }
}
