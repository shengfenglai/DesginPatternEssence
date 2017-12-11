import Build.Builder;
import Build.Person;
import Build.PersonBuilder;
import SingleTon.SingleTon4DoubleCheck;
import SingleTon.SingleTon4Enum;
import SingleTon.SingleTon4Static;

import java.lang.reflect.Constructor;

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
        SingleTon4Enum.INSTANCE.add();

        //反射突破测试
        try {
            //获得构造器
            Constructor con1 = SingleTon4Static.class.getDeclaredConstructor();
            //设置为可访问
            con1.setAccessible(true);
            //构造两个不同的对象
            SingleTon4Static singleton1 = (SingleTon4Static)con1.newInstance();
            SingleTon4Static singleton2 = (SingleTon4Static)con1.newInstance();
            //验证是否是不同对象
            System.out.println(singleton1.equals(singleton2));
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //获得构造器
            Constructor con2 = SingleTon4DoubleCheck.class.getDeclaredConstructor();
            //设置为可访问
            con2.setAccessible(true);
            //构造两个不同的对象
            SingleTon4DoubleCheck singleton3 = (SingleTon4DoubleCheck)con2.newInstance();
            SingleTon4DoubleCheck singleton4 = (SingleTon4DoubleCheck)con2.newInstance();
            //验证是否是不同对象
            System.out.println(singleton3.equals(singleton4));
        }catch (Exception e) {
            e.printStackTrace();
        }


        try {
            //获得构造器
            Constructor con3 = SingleTon4Enum.class.getDeclaredConstructor();
            //设置为可访问
            con3.setAccessible(true);
            //构造两个不同的对象
            SingleTon4Enum singleton5 = (SingleTon4Enum)con3.newInstance();
            SingleTon4Enum singleton6 = (SingleTon4Enum)con3.newInstance();
            //验证是否是不同对象
            System.out.println(singleton5.equals(singleton6));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
