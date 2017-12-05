package Chain;

/**
 * @User: liyixiang
 * @Date: 2017/12/5
 * @TODO:
 *      动作Code枚举
*/
public enum ActionCode {

    ADD(1,"添加"),
    UPDATE(2,"修改"),
    DELETE(3,"删除"),
    BTACH_ADD(4,"批量添加");

    private int value;
    private String desc;

    private ActionCode(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

}
