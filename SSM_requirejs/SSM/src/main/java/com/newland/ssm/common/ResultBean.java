package com.newland.ssm.common;

/**
 * @author wrp
 * @Description com.newland.ssm.common.ResultBean
 * @Date 2017/1/16
 */
public class ResultBean {

    private Integer flag;

    private String msg;

    private Object data;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
