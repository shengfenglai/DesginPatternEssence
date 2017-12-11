package SingleTon;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-枚举法
 */
public enum SingleTon4Enum {
    INSTANCE;

    public static void add(){

    }

    // 不添加该方法则会出现反序列化时出现多个实例的问题
    public Object readResolve() {
        return INSTANCE;
    }
}

