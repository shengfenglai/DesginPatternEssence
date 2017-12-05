package Build;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      建造者模式
 */
public interface Builder {

    //头
    Builder withHead(String head);

    //手
    Builder withHand(String hand);

    //腿
    Builder withLeg(String leg);

    //身体
    Builder withBody(String body);

    //构建
    Person build();

}
