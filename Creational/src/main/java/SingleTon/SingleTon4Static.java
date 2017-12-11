package SingleTon;

import java.io.Serializable;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-静态内部类
 */
public class SingleTon4Static implements Serializable {

    //构造方法私有
    private SingleTon4Static(){}

    public static SingleTon4Static getInstance() {
        return SingleTonInstance.singleTon;
    }

    public static class SingleTonInstance {
        static SingleTon4Static singleTon = new SingleTon4Static();
    }

    // 不添加该方法则会出现反序列化时出现多个实例的问题
    public Object readResolve() {
        return SingleTonInstance.singleTon;
    }

}

