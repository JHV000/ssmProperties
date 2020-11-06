package com.leave.model;

import java.io.Serializable;

/**
 * 错误信息消息体
 */
public class InfoMsg implements Serializable {
    private String code = "0";
    private String msg = "操作成功";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
