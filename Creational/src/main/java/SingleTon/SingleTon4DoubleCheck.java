package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-双重校验锁
 */
public class SingleTon4DoubleCheck {

    private SingleTon4DoubleCheck(){}

    private volatile static SingleTon4DoubleCheck singleTon;

    public static SingleTon4DoubleCheck getInstance(){
        if (null == singleTon) {
            synchronized (SingleTon4DoubleCheck.class) {    //同步锁
                if (null == singleTon) {
                    singleTon = new SingleTon4DoubleCheck();
                }
            }
        }
        return singleTon;
    }
}
