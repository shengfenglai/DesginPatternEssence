package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-枚举法
 */
public enum SingleTon4Enum {
    INSTANCE;

    private SingleTon singleTon;
    //构造方法私有
    private SingleTon4Enum(){
        singleTon = new SingleTon();
    }

    public SingleTon getInstance(){
        return singleTon;
    }

}

/**
 * @User: liyixiang
 * @Date: 2017/12/11
 * @TODO:
 *   需要被单例的类
*/
class SingleTon {

}

