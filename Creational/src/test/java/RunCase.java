import Build.Builder;
import Build.Person;
import Build.PersonBuilder;
import SingleTon.SingleTon4DoubleCheck;
import SingleTon.SingleTon4Enum;
import SingleTon.SingleTon4Static;

/**
 * Created by liyixiang on 2017/12/5.
 */
public class RunCase {

    public static void main(String[] args) {

        //建造者模式测试
        Builder builder = new PersonBuilder();
        Person person = builder.withBody("身体")
                .withHand("手")
                .withLeg("腿")
                .withHead("头")
                .build();
        System.out.println(person.toString());

        //单例模式测试
        SingleTon4Static.getInstance();
        SingleTon4DoubleCheck.getInstance();
        SingleTon4Enum.getInstance();
    }

}
