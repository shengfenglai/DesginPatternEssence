import Build.Builder;
import Build.Person;
import Build.PersonBuilder;

/**
 * Created by liyixiang on 2017/12/5.
 */
public class RunCase {

    public static void main(String[] args) {
        Builder builder = new PersonBuilder();
        Person person = builder.withBody("身体")
                .withHand("手")
                .withLeg("腿")
                .withHead("头")
                .build();
        System.out.println(person.toString());

    }
}
