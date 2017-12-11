package SingleTon;

import java.io.Serializable;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-双重校验锁
 */
public class SingleTon4DoubleCheck implements Serializable {

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

    // 不添加该方法则会出现反序列化时出现多个实例的问题
    public Object readResolve() {
        return singleTon;
    }
}
