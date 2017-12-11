package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-静态内部类
 */
public class SingleTon4Static {

    //构造方法私有
    private SingleTon4Static(){}

    public static SingleTon4Static getInstance() {
        return SingleTonInstance.singleTon;
    }

    public static class SingleTonInstance {
        static SingleTon4Static singleTon = new SingleTon4Static();
    }

}

