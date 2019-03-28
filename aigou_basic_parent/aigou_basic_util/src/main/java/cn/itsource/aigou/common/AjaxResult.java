package cn.itsource.aigou.common;

/**
 * @author: zw
 * @create: 2019-03-26 18:29
 * setter方法设置返回值为AjaxResult，以支持链式编程，便于设置值
 **/
public class AjaxResult {
    //默认成功
    private boolean success = true;
    private String msg = "操作成功！";
    private Object object = null;//保存返回数据

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
