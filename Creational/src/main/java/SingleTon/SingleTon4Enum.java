package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-枚举法
 */
public class SingleTon4Enum{

    private SingleTon4Enum(){}

    public static SingleTon4Enum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingleTon4Enum singleton;
        //JVM会保证此方法绝对只调用一次
        Singleton(){
            singleton = new SingleTon4Enum();
        }
        public SingleTon4Enum getInstance(){
            return singleton;
        }
    }
}

