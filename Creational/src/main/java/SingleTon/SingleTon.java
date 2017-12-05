package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型  静态内部类
 */
public class SingleTon {

    //构造方法私有
    private SingleTon(){}

    public static SingleTon getInstance() {
        return SingleTonInstance.singleTon;
    }

    public static class SingleTonInstance {
        static SingleTon singleTon = new SingleTon();
    }

}

