package com.leave.model;

import com.leave.common.DateUtil;

import java.io.Serializable;

/**
 * 封装响应的数据结构
 */
public class ResponseBody<T> implements Serializable {
    private String date = DateUtil.getCurrentDateStr("yyyy-MM-dd HH:mm:ss");
    private int status = 200;
    private T data;
    private InfoMsg info;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public InfoMsg getInfo() {
        return info;
    }

    public void setInfo(InfoMsg info) {
        this.info = info;
    }


}
