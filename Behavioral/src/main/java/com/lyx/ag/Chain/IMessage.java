package com.lyx.ag.Chain;

import lombok.Data;
import lombok.ToString;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      MQ消息体
*/
@Data
@ToString
public class IMessage {

    //动作编码
    private int actionCode;
    //消息内容
    private String context;
    
}
